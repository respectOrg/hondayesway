package cn.yesway.hondayesway.exception;

public class RateLimitException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public RateLimitException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.RATE_LIMIT, errmsg, languageCode);
	}

}
