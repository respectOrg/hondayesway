import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yesway.hondayesway.service.ClientService;
import cn.yesway.hondayesway.service.LanguageService;
import cn.yesway.hondayesway.service.SettlementService;
import cn.yesway.hondayesway.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
public class ServiceTest {

	@Autowired
	ClientService clientService;

	@Autowired
	SettlementService settlementService;

	@Autowired
	LanguageService languageService;
	
	@Autowired
	UserService userService;
	
	@Test
	public void clientServiceTest() {
		System.out.println("clientService :　"+clientService.getVersion("0517a5c7-b920-40a2-8a78-e4d207da5425","ch"));
	}

	@Test
	public void settlementListServiceTest(){
		System.out.println("settlementService:　"+settlementService.getList("shjjsj","en"));
		
	}
	
	@Test
	public void settlementServiceTest(){
		try {
			System.out.println("settlementService:　"+settlementService.get("shjjsj","1001","en"));
//			System.out.println("settlementService:　"+settlementService.activateService("shjjsj","1001","en"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void feePlanServiceTest(){
		System.out.println("feePlanService:"+settlementService.getFeePlan("100103","ch"));
	}
	
	@Test
	public void languageTest(){
		System.out.println(languageService.getByCodeAndLanguage("Service.ServiceName.1001", "en"));
	}
	
	@Test
	public void userService(){
		System.out.println(userService.get("LHGRH4850G8000024"));
	}
	
}
