package cn.yesway.hondayesway.exception.handler;

import cn.yesway.hondayesway.exception.InternalException;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;

public class CommonExceptionHandler extends BaseExceptionHandler{

	protected CommonExceptionHandler() {

	}
	
	@Override
	public MessageHeaderResponse process(Exception e) {
		return new MessageHeaderResponse(new InternalException("内部错误", ""));
	}

}
