package cn.yesway.hondayesway.exception;

public class SelectException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public SelectException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.SELECT_ERROR, errmsg, languageCode);
	}

}
