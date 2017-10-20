package cn.yesway.hondayesway.headunit.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.SelectException;
import cn.yesway.hondayesway.headunit.service.AuthenticationService;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderRequest;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;
import cn.yesway.hondayesway.service.ClientService;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.vo.ClientApp;
import cn.yesway.hondayesway.vo.Param;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/*")
public class AppClientController {
	private static final Logger log = LoggerFactory.getLogger(AppClientController.class);
	public   static  final String MESSAGE_HEADER = "messageheader";



	@Autowired
	AuthenticationService authenticationService;
	@Autowired
	ClientService clientService;
	@Autowired
	GwLanguageService gwLanguageService;
	@Autowired
	UserService userService;
	@RequestMapping("/version/get")
	public @ResponseBody
	Map<String, Object> getVersion(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute(MESSAGE_HEADER);
		JSONObject data = (JSONObject)req.getAttribute("data");
		log.info("","getVersion Start - header:" + header);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<>();
		ClientApp app = null;
		String language = header.getClientlanguage();
		try {
			authenticationService.authNull(data);
			// String vin = header.getVin();
			String appkey = data.getString("appkey");
			// 验证appkey不为空
			authenticationService.authParams(appkey);
			app = clientService.getVersion(appkey,language);
			if(app == null){
				throw new SelectException("查无结果", ExceptionLanguage.SELECT_EXCEPTION_NOROWS);
			}
		} catch (Exception e) {
			log.error("getVersion - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put(MESSAGE_HEADER, resp);
		if(resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS){
			map.put("data", app);
		}
		log.debug("getVersion End");
		return map;
	}
	
	@RequestMapping("/param/get")
	public @ResponseBody
	Map<String, Object> getParam(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute(MESSAGE_HEADER);
		JSONObject data = (JSONObject)req.getAttribute("data");
		log.info("getParam Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<>();
		String language = header.getClientlanguage();
		List<Param> params = null;

		try {
			//authenticationService.authNull(data);
//			String appkey = data.getString("appkey");
			// 验证appkey不为空
//			authenticationService.authParams(appkey);
			params = clientService.getLatestParams();
			if(params == null || params.isEmpty() || params.size() < 1){
				params = null;
				throw new SelectException("查无结果", ExceptionLanguage.SELECT_EXCEPTION_NOROWS);
			}
		} catch (Exception e) {
			log.error("getParam - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put(MESSAGE_HEADER, resp);
		if(resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS){
			Map<String, Object> respData = new LinkedHashMap<>();
			respData.put("version", params.get(0).getVersion());
			respData.put("params", params);
			map.put("data", respData);
		}
		log.debug("getParam End");
		return map;
	}
	
	//ivr用户同步接口
	@RequestMapping(value = "/ivr/synchronization/user",method=RequestMethod.GET)
	public @ResponseBody
	boolean ivrUserSyn(HttpServletRequest req, HttpServletResponse res) {
		try {
			String caller = req.getParameter("caller");
			authenticationService.authParams(caller);
			//检查是否智驾应用账户  是返回true 否则false
			//获取用户、车辆信息和最新位置信息同步到yccc坐席
			boolean boo = userService.synUser(caller);
			log.info("ivr synchronization user End  return:"+boo);
			return boo;
		} catch (Exception e) {
			log.error("ivr synchronization user - " + e.toString(), e);
			return false;
		}
	}
}
