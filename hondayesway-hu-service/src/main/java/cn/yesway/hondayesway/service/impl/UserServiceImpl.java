package cn.yesway.hondayesway.service.impl;

import cn.yesway.common.soap.userinfoservice.UserInfo;
import cn.yesway.common.soap.userinfoservice.UserInfoService_PortType;
import cn.yesway.common.soap.usersyncservice.*;
import cn.yesway.common.util.*;
import cn.yesway.hondayesway.dao.PositionDao;
import cn.yesway.hondayesway.dao.UserDao;
import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.InvalidParamException;
import cn.yesway.hondayesway.exception.UpdateException;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.util.AppConfig;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.DateUtils;
import cn.yesway.hondayesway.vo.Position;
import cn.yesway.hondayesway.vo.User;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

	private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserDao userDao;

	@Autowired
	UserSyncService_PortType userSyncService;

	@Autowired
	UserInfoService_PortType userInfoService;
	
	@Autowired
	PositionDao positionDao;
	@Override
	public User get(String vin) {
		return userDao.get(vin);
	}

	@Override
	public int add(User user) {
		log.info("add user start, user=" + user.toString());
		int result = userDao.add(user);
		log.info("add user end");
		return result;
	}

	@Override
	public int update(User user) throws Exception {
		log.info("update user start, user= " + user.toString());
		Integer result = 0;
		log.info("update hondayesway's User,the return is " + result);
		log.info("update yeswayplatform's User start ");
		String ret = null;
		if (StringUtils.isBlank(user.getVin())) {
			throw new InvalidParamException("vin is blank", ExceptionLanguage.INVALID_PARAM_EXCEPTION_MISSINGVIN);
		}
		//String zjid = getZjidByCondition(user.getVin(), Integer.parseInt(AppConfig.getParameter(Environment.YESWAY_PRODUCTID)));
		/*if (StringUtils.isNotBlank(zjid)) {
			ret = updateZjUser(user, zjid);
		} else {
			ret = addZjUser(user);
			this.updateUserEndDate(user.getVin(), DateUtils.Date2Calendar(DateUtils.getNextMonthDate(new Date(), 0, 0, -1)));
		}*/
		result = userDao.update(user);
		log.info("update yeswayplatform's User  end,the return zjid is " + ret);
		log.info("update user end");
		return result;
	}

	/**
	 * 智驾用户新增
	 * 
	 * @param user
	 * @return zjid
	 * @throws Exception
	 */
	public String addZjUser(User user) throws Exception {
		log.info("sync zjUser - add...");
		ZJUser zjUser = new ZJUser();
		String result = null;
		try {
			// 基本资料
			UserBaseInfo userBaseInfo = new UserBaseInfo();
			String lastName = user.getLastName() == null ? "" : user.getLastName();
			String firstName = user.getFirstName() == null ? "" : user.getFirstName();
			String fullName = lastName + firstName;
			userBaseInfo.setFullName(fullName);
			userBaseInfo.setPassword(Security.encrypt("123456", "sha1"));
			Integer gender = "F".equals(user.getGender()) ? 1 : 0;
			userBaseInfo.setGender(gender);
			userBaseInfo.setEmail(user.getEmail());
			if (null != user.getBirthday()) {
				userBaseInfo.setBirthday(DateUtils.Date2Calendar(user.getBirthday()));
			}

			// 绑定号码 1主绑定电话 2车机号码 3其他绑定电话
			List<UserBindPhone> phones = new ArrayList<UserBindPhone>();
			UserBindPhone phone;
			if (!StringUtils.isBlank(user.getPhoneNumber1())) {
				phone = new UserBindPhone();
				phone.setPhoneNumber(user.getPhoneNumber1());
				phone.setPhoneType(1);
				phones.add(phone);
			}
			if (!StringUtils.isBlank(user.getPhoneNumber2())) {
				phone = new UserBindPhone();
				phone.setPhoneNumber(user.getPhoneNumber2());
				phone.setPhoneType(3);
				phones.add(phone);
			}
			if (!StringUtils.isBlank(user.getPhoneNumber3())) {
				phone = new UserBindPhone();
				phone.setPhoneNumber(user.getPhoneNumber3());
				phone.setPhoneType(3);
				phones.add(phone);
			}

			// 服务订单
			UserOrder userOrder = new UserOrder();
			userOrder.setProductID(Integer.parseInt(AppConfig.getParameter(Environment.YESWAY_PRODUCTID)));// 本田讴歌智驾产品id-->1056
			userOrder.setStatus(1);
			//2016年4月22日修改  默认有效期为过期(昨天)
			userOrder.setDeadline(DateUtils.Date2Calendar(DateUtils.getNextMonthDate(new Date(), 0, 0, -1)));

			// 车辆信息
			UserVehicleInfo userVehicleInfo = new UserVehicleInfo();
			userVehicleInfo.setVinNO(user.getVin());// Vin
			userVehicleInfo.setLicensePlateNo(user.getPlateNo());// 车牌号

			UserBindPhone[] bindPhones = new UserBindPhone[phones.size()];
			zjUser.setUserBaseInfo(userBaseInfo);
			zjUser.setUserBindPhone(phones.toArray(bindPhones));
			zjUser.setUserOrder(userOrder);
			zjUser.setUserVehicleInfo(userVehicleInfo);
			log.info("zjuser sync... " + JSONObject.toJSONString(zjUser));
			// sectionId 62
			UserSyncResult userSyncResult = userSyncService.add(zjUser, AppConfig.getParameter(Environment.YESWAY_SECTIONID));
			if (userSyncResult != null) {
				result = userSyncResult.getZJID();
			} else {
				log.error("addZjUser userSyncService().add error: return is null");
			}
		} catch (cn.yesway.common.soap.usersyncservice.ErrorMessage e) {
			log.error("addZjUser  error{errorCode:" + e.getErrorCode() + ",errorText:" + e.getText() + "}", e);
			if ("1010".equals(e.getErrorCode())) {
				throw new UpdateException("所填电话已被使用，请更换其它电话再试", ExceptionLanguage.USER_SYNC_ERROR_EXISTPHONE);
			}
			throw e;
		} catch (Exception e) {
			log.error("addZjUser error:", e);
			throw e;
		}
		log.info("sync zjUser - add END");
		return result;
	}

	/**
	 * 更新智驾用户
	 * 
	 * @param user
	 * @return zjid
	 * @throws Exception
	 */
	public String updateZjUser(User user, String zjid) throws Exception {
		log.info("updateZjUser start  user=" + user.toString());
		String result = null;
		try {
			ZJUser zjUser = userSyncService.get(zjid);
			if (zjUser != null) {
				// 基本资料
				String lastName = user.getLastName() == null ? "" : user.getLastName();
				String firstName = user.getFirstName() == null ? "" : user.getFirstName();
				String fullName = lastName + firstName;
				zjUser.getUserBaseInfo().setFullName(fullName);
				zjUser.getUserBaseInfo().setPassword(Security.encrypt("123456", "sha1"));
				Integer gender = "F".equals(user.getGender()) ? 1 : 0;
				zjUser.getUserBaseInfo().setGender(gender);
				zjUser.getUserBaseInfo().setEmail(user.getEmail());
				if (null != user.getBirthday()) {
					zjUser.getUserBaseInfo().setBirthday(DateUtils.Date2Calendar(user.getBirthday()));
				}
				// 绑定号码 1主绑定电话 2车机号码 3其他绑定电话
				List<UserBindPhone> phones = new ArrayList<UserBindPhone>();
				UserBindPhone phone;
				if (!StringUtils.isBlank(user.getPhoneNumber1())) {
					phone = new UserBindPhone();
					phone.setPhoneNumber(user.getPhoneNumber1());
					phone.setPhoneType(1);
					phones.add(phone);
				}
				if (!StringUtils.isBlank(user.getPhoneNumber2())) {
					phone = new UserBindPhone();
					phone.setPhoneNumber(user.getPhoneNumber2());
					phone.setPhoneType(3);
					phones.add(phone);
				}
				if (!StringUtils.isBlank(user.getPhoneNumber3())) {
					phone = new UserBindPhone();
					phone.setPhoneNumber(user.getPhoneNumber3());
					phone.setPhoneType(3);
					phones.add(phone);
				}

				UserBindPhone[] bindPhones = new UserBindPhone[phones.size()];
				zjUser.setUserBindPhone(phones.toArray(bindPhones));

				// 车辆信息
				zjUser.getUserVehicleInfo().setVinNO(user.getVin());// Vin
				zjUser.getUserVehicleInfo().setLicensePlateNo(user.getPlateNo());// 车牌号

				log.info("sync... " + JSONObject.toJSONString(zjUser));
				if (userSyncService.update(zjUser)) {
					result = zjid;
				}
			} else {
				log.info("updateZjUser userSyncService.get(zjid), ZJUser is null");
			}
		} catch (cn.yesway.common.soap.usersyncservice.ErrorMessage e) {
			log.error("addZjUser  error{errorCode:" + e.getErrorCode() + ",errorText:" + e.getText() + "}", e);
			if (1010 == e.getErrorCode()) {
				throw new UpdateException("所填电话已被使用，请更换其它电话再试，如有疑问，请拨打服务电话", ExceptionLanguage.USER_SYNC_ERROR_EXISTPHONE);
			}
			throw e;
		} catch (Exception e) {
			log.error("addZjUser error:", e);
			throw e;
		}
		return result;
	}

	/**
	 * 
	 * 获取ZJID
	 * @param vinNO
	 * @param productID
	 * @return
	 */
	public String getZjidByCondition(String vinNO, Integer productID) {
		log.info("getZjidByCondition start  vinNO=" + vinNO + "&productID=" + productID);
		String zjid = null;
		try {
			UserInfo[] pos = userInfoService.getByVinNO(vinNO);
			if (pos != null && pos.length > 0) {
				for (int i = 0; i < pos.length; i++) {
					Integer tmp = pos[i].getProductInfo().getProductID();
					if (productID.equals(tmp)) {
						zjid = pos[i].getZJID();
						break;
					}
				}
			}
		} catch (cn.yesway.common.soap.userinfoservice.ErrorMessage e) {
			log.error("getZjidByCondition  error{errorCode:" + e.getErrorCode() + ",errorText:" + e.getText() + "}");
		} catch (Exception e) {
			log.error("getZjidByCondition error:", e);
		}
		log.info("getZjidByCondition end  zjid=" + zjid);
		return zjid;
	}

	/**
	 * 修改智驾行用户服务有效期 
	 * <br>
	 * 时间：2016年4月25日 11:05:58
	 */
	public void updateUserEndDate(String vin, Calendar endDate) throws BaseMessageException {
		log.info("Start - vin:" + vin + " ,date:" + DateTimeUtils.getDateTimeStr(endDate));
		try {
			String zjid = getZjidByCondition(vin, Integer.parseInt(AppConfig.getParameter(Environment.YESWAY_PRODUCTID)));
			if(StringUtils.isBlank(zjid)){
				throw new Exception("找不到与vin：" + vin + " 对应的智驾号");
			}
			ZJUser zjUser = userSyncService.get(zjid);
			if(StringUtils.isBlank(zjid)){
				throw new Exception("找不到与zjid：" + zjid + " 对应的智驾用户");
			}
			UserOrder userOrder = zjUser.getUserOrder();
			userOrder.setStatus(1);
			userOrder.setDeadline(endDate);
			zjUser.setUserOrder(userOrder);
			userSyncService.update(zjUser);
		} catch (ErrorMessage e) {
			log.error(e.getText() + " - " + e.getSuggestion(), e);
		} catch (Exception e) {
			log.error("activateService ->userSyncService throw exception;" + e.toString(), e);
		}
		
		log.info("END");
	}

	@Override
	public boolean synUser(String phone) {
		/*** 同步用户信息到YCCC平台      方式 :post  参数 sign  ts  oemid  data ***/
		// 第一步  根据手机号获取用户基本信息 、车辆信息 、最新位置信息
		
		User  user =  userDao.getUserByPhone(phone);

		Position  position =  positionDao.getLastPosition(phone);
		if(user == null){
			return false;
		}
	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("oemid", "acura");
		map.put("ts", DateTimeUtils.getDateTimeStr(new Date(), "yyyyMMddHHmmss"));
		//用来组装data数据
		JSONArray dataArray = new JSONArray();

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("caller", phone);
		jsonObject.put("userid","");

		// 重新封装
		JSONObject userdataObject = new JSONObject();
		//用户信息
		JSONObject userJsonobj =  new JSONObject();
		userJsonobj.put("bindphone", user.getPhoneNumber1());
		userJsonobj.put("username", user.getLastName()+user.getFirstName());
		userJsonobj.put("gender", user.getGender());
		userJsonobj.put("email", user.getEmail());
		userJsonobj.put("exphone1", user.getPhoneNumber1());
		userJsonobj.put("exphone2", user.getPhoneNumber2());
		userJsonobj.put("exphone3", user.getPhoneNumber3());
		userdataObject.put("userinfo", userJsonobj);


		// 发动机信息
		JSONObject vehicleJsonobj =  new JSONObject();
		vehicleJsonobj.put("vin", user.getVin());
		vehicleJsonobj.put("engineno", "");
		vehicleJsonobj.put("plateno", user.getPlateNo());
		vehicleJsonobj.put("vehicletype", "");
		vehicleJsonobj.put("vehiclecolor", "");
		userdataObject.put("vehicleinfo", vehicleJsonobj);
		userdataObject.put("vehiclestatus", new JSONObject());


		//位置信息
		JSONObject positionJsonobj =  new JSONObject();
		if(position == null){
			userdataObject.put("position", positionJsonobj);
		}else{
			positionJsonobj.put("longitude", position.getLongitude());
			positionJsonobj.put("latitude", position.getLatitude());
			positionJsonobj.put("altitude", "");
			positionJsonobj.put("speed", position.getSpeed());
			positionJsonobj.put("heading", position.getHeading());
			positionJsonobj.put("eventcreationtime", DateTimeUtils.getDateTimeStr(position.getAddTime(), "yyyy-MM-dd HH:mm:ss"));
			positionJsonobj.put("coordtype", position.getCoordType());
			userdataObject.put("position", positionJsonobj);
		}
		userdataObject.put("callbackurl", PropUtils.get("user_last_position"));
		jsonObject.put("userdata",userdataObject);
		dataArray.add(jsonObject);
		map.put("data", dataArray);
		try {
			byte [] bts = SecurityUtils.HmacSHA1Encrypt(SecurityUtils.createLinkString(map), "95190");

			map.put("sign", new String(Base64.encodeBase64(bts)));
			log.info(" ready send data :"+JSON.toJSON(map));
			String	result= HttpRequest.sendPost(PropUtils.get("syn_user_url"), map);


			//解析返回值
			JSONObject json = JSONObject.parseObject(result);
			log.info(" sync yccc result :"+json.toString());
		} catch (UnsupportedEncodingException e) {
			log.error(e.toString(),e);
		} catch (Exception ex){
			log.error(ex.toString(),ex);
		}
		return true;
	}

}
