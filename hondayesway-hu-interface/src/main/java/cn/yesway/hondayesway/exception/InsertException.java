package cn.yesway.hondayesway.exception;

public class InsertException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public InsertException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.INSERT_ERROR, errmsg, languageCode);
	}

}
