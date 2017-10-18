package cn.yesway.hondayesway.exception;

public class OutOfServiceException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public OutOfServiceException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.OUT_OF_SERVICE, errmsg, languageCode);
	}

}
