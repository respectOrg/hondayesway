package cn.yesway.hondayesway.service;

import java.util.List;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.vo.FeePlan;
import cn.yesway.hondayesway.vo.ServiceStatus;
import cn.yesway.hondayesway.vo.Settlement;

/**
 * 缴费相关接口
 * 
 * @author 北京九五智驾信息技术股份有限公司
 */
public interface SettlementService {

	/**
	 * 获取全部服务状态
	 * 
	 * @param vin
	 *            车架号
	 * @return 服务状态列表
	 */
	public abstract List<ServiceStatus> getList(String vin,String language);

	/**
	 * 获取某项服务状态
	 * 
	 * @param vin
	 *            车架号
	 * @param serviceId
	 *            服务项编号
	 * @return 服务状态
	 */
	public abstract ServiceStatus get(String vin, String serviceId,String language);

	/**
	 * 修改服务状态
	 * 
	 * @param serviceStatus
	 *            服务状态实体
	 * @return 修改的条数（通常为1）
	 */
	public abstract int updateServiceStatus(ServiceStatus serviceStatus);

	/**
	 * 添加服务状态
	 * 
	 * @param serviceStatus
	 *            服务状态实体
	 * @return 修改的条数（通常为1）
	 */
	public abstract int addServiceStatus(ServiceStatus serviceStatus);

	/**
	 * 获取套餐列表
	 * 
	 * @param serviceId
	 *            服务项编号
	 * @return 套餐列表
	 */
	public abstract List<FeePlan> getFeePlan(String serviceId,String language);

	/**
	 * 添加缴费信息
	 * 
	 * @param settlement
	 *            缴费信息实体
	 * @return 添加的条数（通常为1）
	 */
	public abstract int addSettlement(Settlement settlement);

	/**
	 * 修改缴费信息
	 *  
	 * @param settlement
	 *            缴费信息实体
	 * @return 修改的条数（通常为1）
	 */
	public abstract int updateSettlement(Settlement settlement);

	/**
	 * 激活试用服务
	 * 
	 * @param vin
	 * @param serviceId
	 */
	public abstract ServiceStatus activateService(String vin, String serviceId,String language) throws BaseMessageException;

	/**
	 * 根据settlementId查询
	 * 
	 * @param settlementId
	 * @return Settlement
	 */
	public abstract Settlement getSettlementById(String settlementId);

	/**
	 * 缴费回调
	 * 
	 * @param settlementId
	 *            缴费记录ID
	 * @param payStatus
	 *            支付状态
	 */
	public abstract void settlementCallBack(String settlementId, int payStatus,String language) throws Exception;

	/**
	 * 发送缴费链接短信
	 * 
	 * @param vin
	 *            用户标识
	 * @param feeCode
	 *            套餐编码
	 * @param phoneNumber
	 *            接收短信的链接
	 * @throws Exception
	 */
	public abstract String sendSettlementSms(String vin, String feeCode, String phoneNumber) throws Exception;

}
