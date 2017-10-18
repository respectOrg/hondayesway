package cn.yesway.hondayesway.exception;

public class UpdateException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public UpdateException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.UPDATE_ERROR, errmsg, languageCode);
	}

}
