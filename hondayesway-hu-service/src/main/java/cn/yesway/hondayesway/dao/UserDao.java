package cn.yesway.hondayesway.dao;

import cn.yesway.hondayesway.vo.User;

public interface UserDao {

	public abstract User get(String vin);

	public abstract int add(User us);

	public abstract int update(User us);
	
	public abstract User getUserByPhone(String phone);

}
