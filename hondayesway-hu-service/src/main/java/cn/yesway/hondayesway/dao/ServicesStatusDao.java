package cn.yesway.hondayesway.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yesway.hondayesway.vo.ServiceStatus;

public interface ServicesStatusDao {

	
	public abstract List<ServiceStatus> getList(@Param("vin")String vin, @Param("language")String language);

	public abstract ServiceStatus getServiceStatus(@Param("vin")String vin,@Param("serviceId")String serviceId, @Param("language")String language);
	
	public abstract ServiceStatus get(@Param("vin")String vin,@Param("serviceId")String serviceId , @Param("language")String language);
	
	public abstract int update(ServiceStatus serviceStatus);
	
	public abstract int add(ServiceStatus serviceStatus);
	
}
