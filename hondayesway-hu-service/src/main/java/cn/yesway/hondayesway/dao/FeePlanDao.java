package cn.yesway.hondayesway.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.yesway.hondayesway.vo.FeePlan;

public interface FeePlanDao {

	
	public abstract List<FeePlan> get(@Param("serviceId") String serviceId,@Param("language") String language);
	
	public abstract FeePlan getById(String feeCode);
	
}
