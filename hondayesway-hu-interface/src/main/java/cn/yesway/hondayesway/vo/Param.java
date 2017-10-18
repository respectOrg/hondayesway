package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Param implements Serializable{
	private static final long serialVersionUID = -5997646578835296720L;
	
	/**
	 * 配置项ID
	 */
	@JsonIgnore
	private String paramId;
	/**
	 * 配置项 - 键
	 */
	@JsonProperty("key")
	private String key;
	/**
	 * 配置项 - 值
	 */
	@JsonProperty("value")
	private String value;
	/**
	 * 配置项版本号
	 */
	@JsonIgnore
	private int version;
	/**
	 * 配置项名称
	 */
	@JsonProperty("name")
	private String name;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;

	
	public String getParamId() {
		return paramId;
	}
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n  paramId:").append(paramId).append(",\n  key:").append(key).append(",\n  value:").append(value).append(",\n  version:").append(version).append(",\n  name:").append(name).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}
	
	
	
	
}


