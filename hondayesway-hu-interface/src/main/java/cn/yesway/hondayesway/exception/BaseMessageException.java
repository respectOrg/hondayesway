package cn.yesway.hondayesway.exception;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseMessageException extends Exception{
	private static final long serialVersionUID = -481143207423657534L;

	
	private int errcode;
	private String errmsg;
	
	@JsonIgnore
	private String languageCode;
	
	public BaseMessageException(int errcode, String errmsg){
		super(errmsg);
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
	
	public BaseMessageException(int errcode, String errmsg, String languageCode) {
		super(errmsg);
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{errcode:").append(errcode).append(", ");
		if (errmsg != null)
			builder.append("errmsg:").append(errmsg);
		builder.append("}");
		return builder.toString();
	}

	public BaseMessageException(int errcode, String errmsg, Throwable e) {
		super(errmsg, e);
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	@SuppressWarnings("unused")
	private BaseMessageException() {
	}

	public BaseMessageException(String message) {
	}

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public static class ErrCode{
		public static final int INTERNAL_ERROR = -1;
		public static final int SUCCESS = 0;
		
		public static final int INVALID_PARAM = 1001;
		public static final int RATE_LIMIT = 1002;

		public static final int SELECT_ERROR = 2001;
		public static final int UPDATE_ERROR = 2002;
		public static final int INSERT_ERROR = 2003;
		public static final int DELETE_ERROR = 2004;
		
		public static final int NO_SUCH_VIN = 3001;
		public static final int MULTIPLE_ACTIVATION = 3002;
		public static final int OUT_OF_SERVICE = 3003;
	}
	
}
