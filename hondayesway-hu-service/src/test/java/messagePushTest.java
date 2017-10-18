import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;

import cn.yesway.common.soap.smsservice.Sms;
import cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType;
import cn.yesway.common.util.Environment;
import cn.yesway.hondayesway.dao.FeePlanDao;
import cn.yesway.hondayesway.dao.ParamDao;
import cn.yesway.hondayesway.dao.PositionDao;
import cn.yesway.hondayesway.service.ClientService;
import cn.yesway.hondayesway.service.SettlementService;
import cn.yesway.hondayesway.service.TspService;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.util.AppConfig;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.UuidUtils;
import cn.yesway.hondayesway.vo.Param;
import cn.yesway.hondayesway.vo.Position;
import cn.yesway.hondayesway.vo.ServiceStatus;
import cn.yesway.hondayesway.vo.Settlement;
import cn.yesway.hondayesway.vo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
public class messagePushTest {

	@Autowired
	ClientService clientService;

	@Autowired
	UserService userService;

	@Autowired
	TspService tspServer;

	@Autowired
	SettlementService settlementService;

	@Autowired
	ParamDao paramDao;

	@Autowired
	PositionDao positionDao;

	@Autowired
	FeePlanDao feePlanDao;

	@Autowired
	WebShortMessageSoap_PortType smsServcie;

	static {
		AppConfig.configure("E:\\95190\\javaWebWorkspase\\hondayesway\\hondayesway-hu-service\\src\\main\\webapp\\WEB-INF\\appconfig.xml");
		System.out.println(JSONObject.toJSONString(AppConfig.getPropertyCache()));
	}

	@Test
	public void sendSms() throws RemoteException {
		Sms s = new Sms();
		s.setContent("test");
		s.setAppid(411);
		s.setSrc("106980095190");
		s.setPwd("yesway_webpsw");
		s.setLogo("【九五智驾】");
		s.setDest("18953692866");
		System.out.println(smsServcie.sendText(s));
		// System.out.println(smsServcie.send("18953692866", "test",
		// "106980095190"));//.sendText(s));
	}

	@Test
	public void saveOrUpdateTest() {
		System.out.println("clientService :　"+clientService.getVersion("0517a5c7-b920-40a2-8a78-e4d207da5425","ch").getAppName());
	}

	@Test
	public void getLanTest(){
		
		
	}
	
	@Test
	// 新增配置参数
	public void addParam() {
		Param pam = new Param();
		pam.setParamId(UuidUtils.getUUID());
		pam.setKey("asdasd");
		pam.setValue("12345");
		pam.setVersion(4);
		System.out.println(paramDao.add(pam));

		// 修改配置参数
		pam.setVersion(5);
		pam.setKey("sjssdsads");
		pam.setValue("1123123");
		System.out.println(paramDao.update(pam));

	}

	@Test
	// 查询参数配置信息
	public void getParam() {
		System.out.println(clientService.getLatestParams());
	}

	@Test
	// 根据vin查询用户
	public void getUser() {
		System.out.println(userService.get("1234"));
	}

	@Test
	// 新增用户
	public void addUser() {
		User user = new User();
		user.setVin("LHGRH4850G8000024");
		user.setEmail("");
		user.setPhoneNumber1("18612450982");
		user.setPhoneNumber2("");
		user.setPhoneNumber3("");
		user.setGender("M");
		user.setActivateStatus(0);
		user.setActivateTime(new Date());
		System.out.println(userService.add(user));
	}
	@Test
	// 修改用户信息
	public void updateUser() throws Exception {
		User user = new User();
		user.setVin("LHGRH4850G8000024");
		user.setPhoneNumber1("");
		user.setPhoneNumber2("");
		user.setPhoneNumber3("");
		user.setEmail("");
		user.setGender("");
		user.setActivateStatus(1);
		user.setFirstName("");
		user.setPlateNo("");
		System.out.println(userService.update(user));
	}

	// 上传用户位置点
	@Test
	public void addPosition() {
		Position po = new Position();
		po.setCoordType(1);
		po.setHeading(20);
		po.setLatitude("39.8");
		po.setLongitude("116.3");
		po.setSpeed(80);
		po.setVin("vin12345678901556");
		po.setLocationTime(DateTimeUtils.getNowDate());
		assertEquals("", "");
		System.out.println(tspServer.addPosition(po));

		// 更新用户位置点
		// Position npo = po;
		// npo.setLatitude("1111111");
		// npo.setLongitude("222222");
		// npo.setSpeed(120);
		// positionDao.update(npo);
		// assertFalse(po.getLatitude().equals(npo.getLatitude()));
		// assertFalse(po.getLongitude().equals(npo.getLongitude()));
		// assertFalse(po.getSpeed().equals(npo.getSpeed()));
	}

	@Test
	// 更新用户位置点
	public void updatePosition() {

	}

	@Test
	public void getList() {

	}

	@Test
	// 根据vin 获取用户所有服务状态
	public void getListServicesStatus() {
//		System.out.println(settlementService.getList("vin12345678901050"));
	}

	@Test
	// 根据vin 服务id 查询某项服务信息
	public void getServiceStatus() {
//		System.out.println(settlementService.get("vin12345678901050", "1001"));
	}

	@Test
	// 新添服务状态
	public void addServiceStatus() {
		ServiceStatus serviceStatus = new ServiceStatus();
		serviceStatus.setAddTime(new Date());
		serviceStatus.setServiceId("1002");
		serviceStatus.setServiceName("礼宾服务");
		serviceStatus.setServiceStatus(1);
		serviceStatus.setVin("vin12345678901234");
		System.out.println(settlementService.addServiceStatus(serviceStatus));
	}

	@Test
	// 修改服务状态
	public void updateServiceStatus() {
		ServiceStatus s = new ServiceStatus();
		s.setServiceStatusId("11111");
		s.setStartDate(new Date());
		s.setEndDate(new Date());
		System.out.println(settlementService.updateServiceStatus(s));
	}

	@Test
	// 获取某项服务的计费策略
	public void getListFeeplan() {
		System.out.println(feePlanDao.get("1001","ch"));
	}

	@Test
	// 新增缴费信息
	public void addSettlement() {
		Settlement s = new Settlement();
		s.setServiceId("1001");
		s.setFeeCode("100103");
		s.setPayAmount("500");
		s.setPayMethod(0);
		s.setPayStatus(1);
		s.setVin("vin12345678901234");
		s.setPayDate(new Date());
		System.out.println(settlementService.addSettlement(s));
	}

	@Test
	// 修改缴费信息
	public void updateSettlement() {
		Settlement s = new Settlement();
		s.setSettlementId("B0F12EC5-4CD2-49A1-9AE5-C1323D20824A");
		s.setServiceId("1002");
		s.setFeeCode("100202");
		s.setPayAmount("478");
		s.setPayMethod(0);
		s.setPayStatus(1);
		s.setVin("vin12345678901234");
		System.out.println(settlementService.updateSettlement(s));
	}

	@Test
	// 修改缴费信息
	public void userTest() {
		String phone = "13488656902";
		boolean flag = userService.synUser(phone);
		System.out.println(flag);
	}


}
