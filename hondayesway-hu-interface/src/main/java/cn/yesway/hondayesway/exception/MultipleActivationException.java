package cn.yesway.hondayesway.exception;

public class MultipleActivationException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public MultipleActivationException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.MULTIPLE_ACTIVATION, errmsg, languageCode);
	}

}
