package cn.yesway.hondayesway.dao;

import cn.yesway.hondayesway.vo.Position;

public interface PositionDao {

	
	public abstract Position get();
	
	public abstract int add(Position  po);
	
	public abstract int update(Position  po);
	
	public abstract Position getLastPosition(String  phone);
	
}
