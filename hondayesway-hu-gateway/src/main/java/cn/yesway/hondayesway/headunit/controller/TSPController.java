package cn.yesway.hondayesway.headunit.controller;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import cn.yesway.hondayesway.headunit.service.AuthenticationService;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderRequest;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;
import cn.yesway.hondayesway.service.TspService;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.vo.Position;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/tsp")
public class TSPController {
	private static final Logger log = LoggerFactory.getLogger(TSPController.class);

	@Autowired
	AuthenticationService authenticationService;
	@Autowired
	TspService tspService;
	@Autowired
	GwLanguageService gwLanguageService;

	@RequestMapping("/xcall/send")
	public @ResponseBody
	Map<String, Object> sendXCall(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("sendXCall Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		try {
			// 验证参数
			authenticationService.authNull(data, data.getJSONObject("position"), data.getString("calltype"));
			String calltype = data.getString("calltype").toUpperCase();
			if(!calltype.equals("E") && !calltype.equals("I") && !calltype.equals("B")){
				throw new InvalidParamException("param 'calltype' must be: 'E','I','B'",ExceptionLanguage.INVALID_PARAM_EXCEPTION_TYPEEROR);
			}
			log.debug("sendXCall - CALL TYPE: " + calltype.toUpperCase() + "-Call");
			
			JSONObject position = data.getJSONObject("position");
			String longitude = position.getString("longitude");
			String latitude = position.getString("latitude");
			Integer speed = position.getInteger("speed");
			Integer heading = position.getInteger("heading");
			String locationtimeStr = position.getString("locationtime");
			Date locationtime = DateTimeUtils.convertDate(locationtimeStr, "yyyyMMddHHmmss");
			String positionquality = position.getString("positionquality");
			Integer coordtype = position.getInteger("coordtype");
			authenticationService.authParams(longitude, latitude, locationtimeStr, positionquality);
			if (speed == null || heading == null || coordtype == null) {
				throw new InvalidParamException("必要的参数为空",ExceptionLanguage.INVALID_PARAM_EXCEPTION_NECESSARYPARAMNULL);
			}
			String vin = header.getVin();
			authenticationService.authVin(vin);
			// 构造位置点
			Position p = new Position();
			p.setAddTime(new Date());
			p.setCoordType(coordtype);
			p.setHeading(heading);
			p.setLatitude(latitude);
			p.setLocationTime(locationtime);
			p.setLongitude(longitude);
			p.setPositionQuality(positionquality);
			p.setSpeed(speed);
			p.setVin(vin);
			// 保存
			int result = tspService.addPosition(p);
			if (result < 1) {
				throw new InsertException("保存位置点失败",ExceptionLanguage.LOCATION_SAVE_FAIL);
			}
		} catch (Exception e) {
			log.error("sendXCall - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		log.debug("sendXCall End");
		return map;
	}

}
