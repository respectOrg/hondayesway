/*
 * Beijing YESWAY Information Technology Co,Ltd.
 * All rights reserved.
 * 北京九五智驾信息技术股份有限公司
 * <p>UuidUtils.java</p>
 */
package cn.yesway.hondayesway.util;

import java.util.UUID;

/**
 * 生成UUID长度为32字符串.
 *
 * @version : Ver 1.0
 * @author	: <a href="mailto:hubo@95190.com">hubo</a>
 * @date	: 2015-5-27 上午11:23:55 
 */
public class UuidUtils {

	private UuidUtils(){}
	
	/**
	 * 获取UUID字符
	 *
	 * @author 	: <a href="mailto:hubo@95190.com">hubo</a>  2015-5-27 上午11:26:22
	 * @return  字符串
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().toUpperCase();
	}
	
	public static void main(String[] args) {
		String result = UuidUtils.getUUID();
		
		System.out.println(result);
	}
}

