package cn.yesway.hondayesway.service;

import cn.yesway.hondayesway.vo.Position;

/**
 * T服务接口
 * @author 北京九五智驾信息技术股份有限公司
 */
public interface TspService {

	/**
	 * 添加位置点
	 * @param position 位置点实体
	 * @return 添加的条数，通常为1
	 */
	public abstract int addPosition(Position position);
	
	/**
	 * 获取最新位置点
	 * @param position 位置点实体
	 * @return 添加的条数，通常为1
	 */
	public abstract Position getLastPosition(String phone);
}
