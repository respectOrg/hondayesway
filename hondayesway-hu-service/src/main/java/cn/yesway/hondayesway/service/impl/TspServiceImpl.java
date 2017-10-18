package cn.yesway.hondayesway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_PortType;
import cn.yesway.common.soap.userextrainfoservice.UserLocation;
import cn.yesway.common.soap.userinfoservice.ErrorMessage;
import cn.yesway.common.soap.userinfoservice.UserInfo;
import cn.yesway.common.soap.userinfoservice.UserInfoService_PortType;
import cn.yesway.common.util.Environment;
import cn.yesway.hondayesway.dao.PositionDao;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InsertException;
import cn.yesway.hondayesway.service.TspService;
import cn.yesway.hondayesway.util.AppConfig;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.UuidUtils;
import cn.yesway.hondayesway.vo.Position;

@Service
public class TspServiceImpl implements TspService{
	private final Logger log = LoggerFactory.getLogger(TspServiceImpl.class);
	
	@Autowired
	PositionDao positionDao;
	
	@Autowired
	private UserExtraInfoService_PortType userExtraInfoService;
	@Autowired
	private UserInfoService_PortType userInfoService;
	
	@Override
	public int addPosition(Position position) {
		log.info("START - " + position);
		UserInfo[] users;
		try {
			users = userInfoService.getByVinNO(position.getVin());
			String productId = AppConfig.getParameter(Environment.YESWAY_PRODUCTID);
			UserInfo user = null;
			for(UserInfo _user: users){
				if(_user.getProductInfo() != null && _user.getProductInfo().getProductID().toString().equals(productId)){
					user = _user;
					break;
				}
			}
			if(user == null){
				throw new InsertException("车架号为" + position.getVin() + "的用户未同步", ExceptionLanguage.POSITION_INSERT_ERROR_NOTSYNC);
			}
			UserLocation loc = new UserLocation();
			loc.setZJID(user.getZJID());
			loc.setLongitude(position.getLongitude());
			loc.setLatitude(position.getLatitude());
			loc.setPositioningTime(DateTimeUtils.convertCalendar(position.getLocationTime()));
			loc.setTs(DateTimeUtils.getNowCalendar());
			loc.setUpdateTime(DateTimeUtils.getNowCalendar());
			loc.setSpeed(String.valueOf(position.getSpeed()));
			loc.setProductID(user.getProductInfo().getProductID());
			loc.setCoordType(position.getCoordType());
			userExtraInfoService.updateUserLocation(loc);
		} catch (ErrorMessage e) {
			log.error("sync location FAILED ! " + e.getText(), e);
		} catch (Exception e) {
			log.error("sync location FAILED !! ", e);
		}
		//生成UUid
		position.setPositionId(UuidUtils.getUUID());
		int result = positionDao.add(position);
		log.info("END - " + result);
		return result;
	}

	@Override
	public Position getLastPosition(String phone) {
		// 
		return positionDao.getLastPosition(phone);
	}

}
