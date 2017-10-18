package cn.yesway.hondayesway.exception.handler;

import cn.yesway.hondayesway.exception.BaseMessageException;
import cn.yesway.hondayesway.headunit.vo.MessageHeaderResponse;

public class MessageExceptionHandler extends BaseExceptionHandler{

	protected MessageExceptionHandler() {

	}
	
	@Override
	public MessageHeaderResponse process(Exception e) {
		MessageHeaderResponse resp = new MessageHeaderResponse(0, "");
		if(e instanceof BaseMessageException){
			resp = new MessageHeaderResponse(((BaseMessageException) e).getErrcode(), e.getMessage());
		} else {
			return this.getNextnode().process(e);
		}
		return resp;
	}

}
