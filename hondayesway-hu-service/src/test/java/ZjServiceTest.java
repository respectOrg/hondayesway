import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yesway.common.soap.userinfoservice.UserInfoService_PortType;
import cn.yesway.common.soap.userinfoservice.UserIntegral;
import cn.yesway.common.soap.usersyncservice.ErrorMessage;
import cn.yesway.common.soap.usersyncservice.UserBaseInfo;
import cn.yesway.common.soap.usersyncservice.UserBindPhone;
import cn.yesway.common.soap.usersyncservice.UserOrder;
import cn.yesway.common.soap.usersyncservice.UserSyncResult;
import cn.yesway.common.soap.usersyncservice.UserSyncService_PortType;
import cn.yesway.common.soap.usersyncservice.UserVehicleInfo;
import cn.yesway.common.soap.usersyncservice.ZJUser;
import cn.yesway.common.util.Environment;
import cn.yesway.common.util.Security;
import cn.yesway.hondayesway.service.ClientService;
import cn.yesway.hondayesway.service.LanguageService;
import cn.yesway.hondayesway.service.SettlementService;
import cn.yesway.hondayesway.service.UserService;
import cn.yesway.hondayesway.util.AppConfig;
import cn.yesway.hondayesway.util.DateTimeUtils;
import cn.yesway.hondayesway.util.DateUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
public class ZjServiceTest {

	@Autowired
	UserSyncService_PortType userSyncService;

	@Autowired
	UserInfoService_PortType userInfoService;
	
	@Test
	public void getZjUser() throws ErrorMessage, RemoteException {
		ZJUser user = userSyncService.get("95950006");
		System.out.println("clientService :　" + JSONObject.fromObject(user));
		System.out.println("deadline :　" + DateTimeUtils.getDateTimeStr(user.getUserOrder().getDeadline()));
	}

	@Test
	public void updateZjUser() throws Exception{
		ZJUser user = userSyncService.get("95950006");
		System.out.println("clientService :　" + JSONObject.fromObject(user));
		UserOrder userOrder = new UserOrder();
		if(user.getUserOrder() != null){
			System.out.println("deadline :　" + DateTimeUtils.getDateTimeStr(user.getUserOrder().getDeadline()));
		}
		userOrder.setProductID(1056);// 本田讴歌智驾产品id-->1056
		userOrder.setStatus(1);
		userOrder.setDeadline(DateTimeUtils.convertCalendar(DateTimeUtils.convertDate("2016-4-27 00:00:00")));
		user.setUserOrder(userOrder);
		System.out.println(userSyncService.update(user));
	}
	
	@Test
	public void addZjUser() throws Exception{
		String _phone = "18618169801";
		
		ZJUser zjUser = new ZJUser();
		// 基本资料
		UserBaseInfo userBaseInfo = new UserBaseInfo();
		String lastName = "Nan";
		String firstName = "ZeCong";
		String fullName = lastName + firstName;
		userBaseInfo.setFullName(fullName);
		userBaseInfo.setPassword(Security.encrypt("123456", "sha1"));
		Integer gender = "F".equals("F") ? 1 : 0;
		userBaseInfo.setGender(gender);
		userBaseInfo.setEmail("nianzecong@95190.com");
		// 绑定号码 1主绑定电话 2车机号码 3其他绑定电话
		List<UserBindPhone> phones = new ArrayList<UserBindPhone>();
		UserBindPhone phone = new UserBindPhone();
		phone.setPhoneNumber(_phone);
		phone.setPhoneType(1);
		phones.add(phone);
		// 服务订单
		UserOrder userOrder = new UserOrder();
		userOrder.setProductID(1056);// 本田讴歌智驾产品id-->1056
		userOrder.setStatus(1);
		//2016年4月22日修改  默认有效期为过期(昨天)
		userOrder.setDeadline(DateUtils.Date2Calendar(DateUtils.getNextMonthDate(new Date(), 0, 0, -1)));

		// 车辆信息
		UserVehicleInfo userVehicleInfo = new UserVehicleInfo();
		userVehicleInfo.setVinNO("vin-nianzecong2");// Vin
		userVehicleInfo.setLicensePlateNo("京A12345");// 车牌号
		// 绑定电话信息
		UserBindPhone[] bindPhones = new UserBindPhone[phones.size()];
		zjUser.setUserBaseInfo(userBaseInfo);
		zjUser.setUserBindPhone(phones.toArray(bindPhones));
		zjUser.setUserOrder(userOrder);
		zjUser.setUserVehicleInfo(userVehicleInfo);
		// sectionId 62
		System.out.println("zjuser sync... " + JSONObject.fromObject(zjUser));
		System.out.println("deadline :　" + DateTimeUtils.getDateTimeStr(zjUser.getUserOrder().getDeadline()));
		UserSyncResult userSyncResult = userSyncService.add(zjUser, "62");
		System.out.println("zjuser sync - " + JSONObject.fromObject(userSyncResult));
		//查看智驾用户服务有效期
		ZJUser user = userSyncService.get(userSyncResult.getZJID());
		System.out.println("clientService :　" + JSONObject.fromObject(user));
		System.out.println("deadline :　" + DateTimeUtils.getDateTimeStr(user.getUserOrder().getDeadline()));
		System.out.println("update ...");
		//更新智驾用户有效期
		userSyncService.update(zjUser);
		//查看智驾用户服务有效期
		user = userSyncService.get(userSyncResult.getZJID());
		System.out.println("clientService :　" + JSONObject.fromObject(user));
		System.out.println("deadline :　" + DateTimeUtils.getDateTimeStr(user.getUserOrder().getDeadline()));
	}
	
}
