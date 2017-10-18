package cn.yesway.hondayesway.headunit.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.exception.ExceptionLanguage;
import cn.yesway.hondayesway.exception.handler.ExceptionHandlerFactory;
import cn.yesway.hondayesway.headunit.service.GwLanguageService;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;
import cn.yesway.hondayesway.service.LanguageService;
import cn.yesway.hondayesway.vo.Language;

@Service
public class GwLanguageServiceImpl implements GwLanguageService {

	@Autowired
	LanguageService languageService;

	@Override
	public MessageHeaderResponse process(Exception e, String language) {
		// 责任链处理异常
		MessageHeaderResponse resp = ExceptionHandlerFactory.getHandler()
				.process(e);
		// 取语言代码
		String languageCode = ExceptionLanguage.INTERNAL_ERROR;
		if (e instanceof BaseMessageException) {
			BaseMessageException _e = (BaseMessageException) e;
			languageCode = _e.getLanguageCode();
		}
		// 查询多语言异常内容
		Language content = languageService.getByCodeAndLanguage(languageCode,
				language);
		if (content != null && StringUtils.isNotBlank(content.getContent())) {
			resp.setErrmsg(content.getContent());
		}

		return resp;
	}

}
