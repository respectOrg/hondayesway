package cn.yesway.hondayesway.dao;

import cn.yesway.hondayesway.vo.ClientApp;

public interface ClientAppDao {

	public abstract ClientApp get(String appId,String language);
	
	//根据appid 修改版本信息
	public abstract ClientApp update(String appId);
	
}
