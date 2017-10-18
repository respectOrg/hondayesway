package cn.yesway.hondayesway.headunit.controller;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InsertException;
import cn.yesway.hondayesway.exception.InvalidParamException;
import cn.yesway.hondayesway.exception.UpdateException;
import cn.yesway.hondayesway.headunit.service.AuthenticationService;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderRequest;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.vo.User;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/*")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	AuthenticationService authenticationService;
	@Autowired
	UserService userService;
	@Autowired
	GwLanguageService gwLanguageService;
	
	@RequestMapping("/user/get")
	public @ResponseBody
	Map<String, Object> getUser(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("getUser Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		User user = null;
		try {
			String vin = header.getVin();
			authenticationService.authParams(vin);
			if(vin.length() > 17){
				throw new InvalidParamException("vin过长",ExceptionLanguage.INVALID_PARAM_EXCEPTION_VINTOLONG);
			}
			user = userService.get(vin);
			if (user == null) {
				user = new User();
				user.setVin(vin);
				user.setActivateStatus(0);
				int result = userService.add(user);
				if (result < 1) {
					throw new InsertException("新建用户错误",ExceptionLanguage.USER_NEW_ERROR);
				}
			}
		} catch (Exception e) {
			log.error("getUser - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if (resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS) {
			Map<String, Object> respData = new LinkedHashMap<String, Object>();
			respData.put("user", user);
			map.put("data", respData);
		}
		log.debug("getUser End");
		return map;
	}

	@RequestMapping("/user/update")
	public @ResponseBody
	Map<String, Object> updateUser(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("updateUser Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		User user = null;
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String vin = header.getVin();
			String userStr = data.getString("user");
			authenticationService.authParams(userStr);
			user = authenticationService.authVin(vin);
			// 获取传入用户信息并验证必填
			JSONObject userJson = data.getJSONObject("user");
			String plateno = userJson.getString("plateno");
			String firstname = userJson.getString("firstname");
			String lastname = userJson.getString("lastname");
			String birthdayStr = userJson.getString("birthday");
			Date birthday = DateTimeUtils.convertDate(birthdayStr, DateTimeUtils.DATEPATTERN);
			String email = userJson.getString("email");
			String gender = userJson.getString("gender");
			gender = !StringUtils.isBlank(gender) && ( gender.equals("M") || gender.equals("F") || gender.equals("f") || gender.equals("m")) ? gender.toUpperCase() : "M";
			String phonenumber1 = userJson.getString("phonenumber1");
			String phonenumber2 = userJson.getString("phonenumber2");
			String phonenumber3 = userJson.getString("phonenumber3");
			//authenticationService.authParams(phonenumber1);
			// 修改
			user.setPlateNo(plateno);
			user.setFirstName(firstname);
			user.setLastName(lastname);
			user.setBirthday(birthday);
			user.setGender(gender);
			user.setEmail(email);
			user.setPhoneNumber1(phonenumber1);
			user.setPhoneNumber2(phonenumber2);
			user.setPhoneNumber3(phonenumber3);
			int result = userService.update(user);
			if (result < 1) {
				throw new UpdateException("用户修改错误",ExceptionLanguage.USER_EDITE_RROR);
			}
		} catch (Exception e) {
			log.error("updateUser - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		log.debug("updateUser End");
		return map;
	}

	@RequestMapping("/user/activate")
	public @ResponseBody
	Map<String, Object> activateUser(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("activateUser Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		User user = null;
		try {
			// 验证必要参数
			String vin = header.getVin();
			user = authenticationService.authVin(vin);
			// 避免重复激活
			if(user.getActivateStatus() == 1){
				log.debug("activateUser - 重复激活，直接返回正确");
				throw new BaseMessageException(BaseMessageException.ErrCode.SUCCESS, "");
			}
			// 修改激活状态
			user.setActivateStatus(1);
			user.setActivateTime(new Date());
			int result = userService.update(user);
			if (result < 1) {
				throw new UpdateException("用户激活错误",ExceptionLanguage.USER_ACTIVE_ERROR_MULTIPLE);
			}
		} catch (Exception e) {
			log.error("activateUser - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		log.debug("activateUser End");
		return map;
	}
}
