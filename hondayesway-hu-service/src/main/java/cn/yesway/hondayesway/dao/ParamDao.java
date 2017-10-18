package cn.yesway.hondayesway.dao;

import java.util.List;

import cn.yesway.hondayesway.vo.Param;

public interface ParamDao {

	
	public abstract List<Param> get();
	
	public abstract int add(Param pam);
	
	public abstract int update(Param pam);
}
