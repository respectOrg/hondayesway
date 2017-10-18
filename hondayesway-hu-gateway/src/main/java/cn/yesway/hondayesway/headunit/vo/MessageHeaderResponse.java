package cn.yesway.hondayesway.headunit.vo;

import java.io.Serializable;

import cn.yesway.hondayesway.exception.BaseMessageException;

public class MessageHeaderResponse implements Serializable {
	private static final long serialVersionUID = 8417605956245957132L;

	private int errcode;
	private String errmsg;
	
	public MessageHeaderResponse(int errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}
	
	public MessageHeaderResponse(BaseMessageException e){
		this.errcode = e.getErrcode();
		this.errmsg = e.getErrmsg();
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{errcode:").append(errcode).append(", ");
		if (errmsg != null)
			builder.append("errmsg:").append(errmsg);
		builder.append("}");
		return builder.toString();
	}

}

