package cn.yesway.hondayesway.headunit.vo;

import java.io.Serializable;

public class MessageHeaderRequest implements Serializable {
	private static final long serialVersionUID = 8417605956245957132L;

	private String vin;
	private String timestamp;
	private String version;
	private String clientlanguage; // zh|en|ja_JP
								// (http://www.douban.com/group/topic/37393602/)

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getClientlanguage() {
		return clientlanguage;
	}

	public void setClientlanguage(String clientlanguage) {
		this.clientlanguage = clientlanguage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n  vin:").append(vin).append(",\n  timestamp:").append(timestamp).append(",\n  version:").append(version).append(",\n  clientlanguage:").append(clientlanguage).append("\n}");
		return builder.toString();
	}

}
