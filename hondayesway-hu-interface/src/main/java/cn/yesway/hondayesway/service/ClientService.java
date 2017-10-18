package cn.yesway.hondayesway.service;

import java.util.List;

import cn.yesway.hondayesway.vo.ClientApp;
import cn.yesway.hondayesway.vo.Param;

/**
 * APP功能接口
 * @author 北京九五智驾信息技术股份有限公司
 */
public interface ClientService {

	/**
	 * 获取app版本信息<br>
	 * @param appkey app标识
	 * @return 版本信息
	 */
	public abstract ClientApp getVersion(String appkey,String language);

	/**
	 * 获取最新版本的配置项<br>
	 * 根据“Version”分组，返回Version最大的一组配置信息
	 * 
	 * @return 最新配置列表
	 */
	public abstract List<Param> getLatestParams();
	
}
