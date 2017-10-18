package cn.yesway.hondayesway.exception;

public class DeleteException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public DeleteException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.UPDATE_ERROR, errmsg, languageCode);
	}

}
