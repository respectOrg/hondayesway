package cn.yesway.hondayesway.headunit.service;

import cn.yesway.hondayesway.vo.User;

public interface AuthenticationService {

	/**
	 * 验证参数不为空
	 * 
	 * @param params
	 *            要验证的参数
	 * @throws Exception
	 *             验证失败抛出异常
	 */
	public abstract void authParams(String... params) throws Exception;

	/**
	 * 验证参数是否为空
	 * 
	 * @param params
	 *            要验证的参数
	 * @throws Exception
	 * <br>
	 *             InvalidParamException 有参数为空
	 */
	public abstract void authNull(Object... params) throws Exception;

	/**
	 * 验证VIN是否存在
	 * 
	 * @param vin
	 *            车架号
	 * @return 用户
	 * @throws Exception
	 * <br>
	 *             InvalidParamException 参数为空<br>
	 *             NoSuchVinException 用户不存在
	 */
	public abstract User authVin(String vin) throws Exception;

	/**
	 * 验证是否为double类型
	 * 
	 * @param number
	 * @throws Exception
	 */
	public abstract Double convertDouble(String number) throws Exception;

	/**
	 * 验证是否为Integer类型
	 * 
	 * @param number
	 * @throws Exception
	 */
	public abstract Integer convertInteger(String number) throws Exception;

}
