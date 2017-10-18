package cn.yesway.hondayesway.service.impl; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.hondayesway.dao.LanguageDao;
import cn.yesway.hondayesway.service.LanguageService;
import cn.yesway.hondayesway.vo.Language;

/**
 *  基本CURD操作在MybatisBaseServiceImpl中实现
 *  否则自行声明接口，实现方法
 */
@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	LanguageDao languageDao;
	
	@Override
	public Language getByCodeAndLanguage(String code, String language) {
		return languageDao.getByCodeAndLanguage(code, language);
	} 

}
