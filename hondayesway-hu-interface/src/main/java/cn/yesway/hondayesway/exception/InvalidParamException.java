package cn.yesway.hondayesway.exception;

public class InvalidParamException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public InvalidParamException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.INVALID_PARAM, errmsg, languageCode);
	}

}
