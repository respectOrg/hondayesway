package cn.yesway.hondayesway.exception;

public class NoSuchVinException extends BaseMessageException{

	private static final long serialVersionUID = -5487001992652065825L;

	public NoSuchVinException(String errmsg, String languageCode) {
		super(BaseMessageException.ErrCode.NO_SUCH_VIN, errmsg, languageCode);
	}

}
