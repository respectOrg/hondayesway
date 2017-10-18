package cn.yesway.hondayesway.dao;

import java.util.List;

import cn.yesway.hondayesway.vo.Settlement;

public interface SettlementDao {

	public abstract List<Settlement>get(String vin);
	
	public abstract int add(Settlement  settlement);
	
	public abstract int update(Settlement  settlement);
	
	public abstract Settlement getById(String  settlementId);
}
