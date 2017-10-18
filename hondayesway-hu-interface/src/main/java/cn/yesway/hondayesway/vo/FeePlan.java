package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FeePlan implements Serializable {
	private static final long serialVersionUID = 1020797752173765949L;
	
	/**
	 * 计费代码
	 */
	@JsonProperty("feecode")
	private String feeCode;
	/**
	 * 服务项ID
	 */
	@JsonIgnore
	private String serviceId;
	/**
	 * 计费策略名称
	 */
	@JsonProperty("feename")
	private String feeName;
	/**
	 * 价格
	 */
	@JsonProperty("price")
	private String price;
	/**
	 * 月数
	 */
	@JsonProperty("months")
	private int months;
	/**
	 * 计费策略类型<br>
	 * 1默认，2免费体验，其他待定义
	 */
	@JsonIgnore
	private int type;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;

	public String getFeeCode() {
		return feeCode;
	}
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
		builder.append("{\n  feeCode:").append(feeCode).append(",\n  serviceId:").append(serviceId).append(",\n  feeName:").append(feeName).append(",\n  price:").append(price).append(",\n  months:").append(months).append(",\n  type:").append(type).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}

}
