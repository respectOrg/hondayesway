package cn.yesway.hondayesway.controller;

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

import cn.yesway.hondayesway.service.TspService;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.vo.Position;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/position")
public class PositionController  {

	private static final Logger log = LoggerFactory.getLogger(PositionController.class);
	
	@Autowired
	private TspService tspService;
	
	@RequestMapping("/last/get")
	public @ResponseBody
	Map<String, Object> getPositionLast(HttpServletRequest req, HttpServletResponse res, ModelMap model) {
		JSONObject data = (JSONObject) req.getAttribute("data");
		log.debug("getPositionLast Start - request body:" + req.getQueryString());
		// 返回数据体
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		String phone = data.getJSONObject("data").getString("caller");
		//获取电话号码获取车辆的最后位置点信息返回
		log.info("request param:"+ data.toString());
		try {
			Position position = tspService.getLastPosition(phone);
			JSONObject positionJsonobj = new JSONObject();
			if(position == null){
				positionJsonobj.put("position", new JSONObject());
			}else{
				positionJsonobj.put("longitude", position.getLongitude());
				positionJsonobj.put("latitude", position.getLatitude());
				positionJsonobj.put("altitude", "");
				positionJsonobj.put("speed", position.getSpeed());
				positionJsonobj.put("heading", position.getHeading());
				positionJsonobj.put("eventcreationtime", DateTimeUtils.getDateTimeStr(position.getAddTime(), "yyyy-MM-dd HH:mm:ss"));
				positionJsonobj.put("coordtype", position.getCoordType());
			}
			map.put("errcode", "0");
			map.put("errmsg", "");
			map.put("data", positionJsonobj);
		} catch (Exception e) {
			log.error("sendXCall - " + e.toString(), e);
			map.put("errcode", "-9999");
			map.put("errmsg", "未知错误");
		}
		log.debug("getPositionLast End");
		return map;
	}

}
