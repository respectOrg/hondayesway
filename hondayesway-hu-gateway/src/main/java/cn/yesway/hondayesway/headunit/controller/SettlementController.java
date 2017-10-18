package cn.yesway.hondayesway.headunit.controller;

import java.util.Date;
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
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InternalException;
import cn.yesway.hondayesway.headunit.service.AuthenticationService;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderRequest;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;
import cn.yesway.hondayesway.service.SettlementService;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.DateUtils;
import cn.yesway.hondayesway.vo.FeePlan;
import cn.yesway.hondayesway.vo.ServiceStatus;
import cn.yesway.hondayesway.vo.Settlement;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/*")
public class SettlementController {
	private static final Logger log = LoggerFactory.getLogger(SettlementController.class);

	@Autowired
	AuthenticationService authenticationService;
	@Autowired
	SettlementService settlementService;
	@Autowired
	GwLanguageService gwLanguageService;
	
	@RequestMapping("/servicestatus/list/get")
	public @ResponseBody
	Map<String, Object> getServicestatusList(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("getServicestatusList Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		List<ServiceStatus> list = null;
		String language = header.getClientlanguage();
		try {
			// 验证必要参数
			String vin = header.getVin();
			authenticationService.authVin(vin);
			list = settlementService.getList(vin,language);
		} catch (Exception e) {
			log.error("getServicestatusList - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if (resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS) {
			Map<String, Object> respData = new LinkedHashMap<String, Object>();
			respData.put("servicestatus", list);
			map.put("data", respData);
		}
		log.debug("getServicestatusList End");
		return map;
	}

	@RequestMapping("/servicestatus/get")
	public @ResponseBody
	Map<String, Object> getServicestatus(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("getServicestatus Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		ServiceStatus servicestatus = null;
		String freeStartDate = "";
		String freeEndDate = "";
		String language = header.getClientlanguage();
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String serviceid = data.getString("serviceid");
			authenticationService.authParams(serviceid);
			String vin = header.getVin();
			authenticationService.authVin(vin);
			servicestatus = settlementService.get(vin, serviceid,language);
			// 服务未订购，需要返回激活后的服务期
			if(servicestatus.getServiceStatus() == 0){
				List<FeePlan> plans = settlementService.getFeePlan(servicestatus.getServiceId(),language);
				FeePlan freePlan = null;
				if(plans == null || plans.size() < 1){
					throw new InternalException("未找到服务" + servicestatus.getServiceName() + " - " + servicestatus.getServiceId() + " 所关联的计费策略",ExceptionLanguage.NOT_FIND_ASSOCIATE_SERVICE_POLICY);
				}
				for(FeePlan plan : plans){
					if(plan.getType() == 2){// 2免费体验
						freePlan = plan;
						break;
					}
				}
				if(freePlan == null){
					throw new InternalException("未找到服务" + servicestatus.getServiceName() + " - " + servicestatus.getServiceId() + " 所关联的免费体验套餐",ExceptionLanguage.NOT_FIND_ASSOCIATE_SERVICE_PACKAGES);
				}
				Date now = new Date();
				freeStartDate = DateTimeUtils.getDateTimeStr(now, DateTimeUtils.DATEPATTERN);
				Date endDate = DateUtils.getNextMonthDate(now, 0, freePlan.getMonths(), 0);
				freeEndDate = DateTimeUtils.getDateTimeStr(endDate, DateTimeUtils.DATEPATTERN);
			}
		} catch (Exception e) {
			log.error("getServicestatus - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if (resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS) {
			Map<String, Object> respData = new LinkedHashMap<String, Object>();
			respData.put("servicestatus", servicestatus);
			respData.put("freestartdate", freeStartDate);
			respData.put("freeenddate", freeEndDate);
			map.put("data", respData);
		}
		log.debug("getServicestatus End");
		return map;
	}

	@RequestMapping("/service/activate")
	public @ResponseBody
	Map<String, Object> activateService(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("activateService Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		ServiceStatus serviceStatus = null;
		String language = header.getClientlanguage();
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String serviceid = data.getString("serviceid");
			authenticationService.authParams(serviceid);
			authenticationService.convertInteger(serviceid);
			String vin = header.getVin();
			authenticationService.authVin(vin);
			// 激活
			serviceStatus = settlementService.activateService(vin, serviceid,language);
		} catch (Exception e) {
			log.error("activateService - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if(resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS){
			Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
			dataMap.put("servicestatus", serviceStatus);
			map.put("data", dataMap);
		}
		log.debug("activateService End");
		return map;
	}

	@RequestMapping("/feeplan/list/get")
	public @ResponseBody
	Map<String, Object> getFeePlanList(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("getFeePlanList Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		List<FeePlan> list = null;
		String language = header.getClientlanguage();
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String vin = header.getVin();
			authenticationService.authVin(vin);
			String serviceid = data.getString("serviceid");
			authenticationService.authParams(serviceid);
			list = settlementService.getFeePlan(serviceid,language);
			// 移除体验套餐
			for (int i = 0; i < list.size(); i++) {
				FeePlan item = list.get(i);
				if (item.getType() == 2) {
					list.remove(i);
				}
			}
		} catch (Exception e) {
			log.error("getFeePlanList - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if (resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS) {
			Map<String, Object> respData = new LinkedHashMap<String, Object>();
			respData.put("feeplans", list);
			map.put("data", respData);
		}
		log.debug("getFeePlanList End");
		return map;
	}
	
	@RequestMapping("/settlement/sms/send")
	public @ResponseBody
	Map<String, Object> addSettlementAndSendMsg(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("addSettlementAndSendMsg Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		Map<String, Object> result = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		String settlementid = "";
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String vin = header.getVin();
			authenticationService.authVin(vin);
			String feeCode = data.getString("feecode");
			String phoneNumber=data.getString("phonenumber");
			authenticationService.authParams(feeCode, phoneNumber);

			settlementid= settlementService.sendSettlementSms(vin, feeCode, phoneNumber);
		} catch (Exception e) {
			log.error("addSettlementAndSendMsg - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		result.put("settlementid",settlementid );
		map.put("messageheader", resp);
		map.put("data", result);
		
		log.debug("addSettlementAndSendMsg End");
		return map;
	}
	@RequestMapping("/settlement/get")
	public @ResponseBody Map<String, Object> getSettlementById(HttpServletRequest req, HttpServletResponse res){
		MessageHeaderRequest header = (MessageHeaderRequest) req.getAttribute("messageheader");
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("addSettlementAndSendMsg Start - header:" + header + ", data:" + data);
		// 返回数据头
		MessageHeaderResponse resp = new MessageHeaderResponse(BaseMessageException.ErrCode.SUCCESS, "");
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String language = header.getClientlanguage();
		Settlement settlement = null;
		try {
			// 验证必要参数
			authenticationService.authNull(data);
			String vin = header.getVin();
			authenticationService.authVin(vin);
			String settlementid = data.getString("settlementid");
			authenticationService.authParams(settlementid);
			settlement = settlementService.getSettlementById(settlementid);
		} catch (Exception e) {
			log.error("getSettlementById - " + e.toString(), e);
			resp = gwLanguageService.process(e, language);
		}
		map.put("messageheader", resp);
		if (resp.getErrcode() == BaseMessageException.ErrCode.SUCCESS) {
			map.put("data", settlement);
		}
		return map;
	}
}
