package cn.yesway.hondayesway.headunit.service;

import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;


public interface GwLanguageService {
	
	public abstract MessageHeaderResponse process(Exception e, String language);
	
}
