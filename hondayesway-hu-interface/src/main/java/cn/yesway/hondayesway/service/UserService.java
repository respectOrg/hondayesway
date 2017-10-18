package cn.yesway.hondayesway.service;

import java.util.Calendar;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.vo.User;

/**
 * 用户接口
 * @author 北京九五智驾信息技术股份有限公司
 */
public interface UserService {
	
	/**
	 * 根据VIN查找用户
	 * @param vin
	 * @return
	 */
	public abstract	User get(String vin);
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public abstract int add(User user);
	
	/** 
	 * 修改用户
	 * @param user
	 * @return
	 */
	public abstract int update(User user) throws Exception;

	/** 
	 * 修改服务到期日期
	 * @param vin
	 * @param month
	 * @throws BaseMessageException
	 */
	public void updateUserEndDate(String vin, Calendar endDate) throws BaseMessageException;
	
	/** 
	 * 同步用户
	 * @param phone
	 * @return
	 */
	public boolean synUser(String phone);
	
}
