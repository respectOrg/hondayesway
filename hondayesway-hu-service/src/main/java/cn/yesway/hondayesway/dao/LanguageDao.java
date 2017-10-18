package cn.yesway.hondayesway.dao;  

import org.apache.ibatis.annotations.Param;

import cn.yesway.hondayesway.vo.Language;

/**
 *  LanguageDao
 */
public interface LanguageDao{
	
	public abstract Language getByCodeAndLanguage(@Param("code")String code, @Param("language")String language);
}
