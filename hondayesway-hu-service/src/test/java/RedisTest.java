import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yesway.hondayesway.redis.RedisSentinelManager;
import cn.yesway.hondayesway.util.DateTimeUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
public class RedisTest {
	
	@Autowired
	RedisSentinelManager redisSentinelManager;
	
	private String KEY = "hondayesway:test.";
	
	@Test
	public void redisTest(){
		String result = redisSentinelManager.set(KEY, "test-" + DateTimeUtils.getNowDateTimeStr(), 200);
		System.out.println(" ================= " + result + ": " + redisSentinelManager.get(KEY));
		/*redisSentinelManager.del(KEY);
		System.out.println(" ================= " + result + ": " + redisSentinelManager.get(KEY));
		redisSentinelManager.del(KEY);
		System.out.println(" ================= " + result + ": " + redisSentinelManager.get(KEY));*/
	}
	
}
