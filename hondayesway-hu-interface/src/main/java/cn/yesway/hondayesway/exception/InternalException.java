package cn.yesway.hondayesway.exception;

public class InternalException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public InternalException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.INTERNAL_ERROR, errmsg, languageCode);
	}

}
