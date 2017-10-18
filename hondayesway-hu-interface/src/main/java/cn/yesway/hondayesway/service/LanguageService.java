package cn.yesway.hondayesway.service;   

import cn.yesway.hondayesway.vo.Language;

/**
 *  LanguageService接口
 */
public interface LanguageService{
	
	/**
	 * 通过code和language获取
	 * @param code
	 * @param language
	 * @return
	 */
	public abstract Language getByCodeAndLanguage(String code,String language);

}
