package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Settlement implements Serializable {
	private static final long serialVersionUID = -5917030274208804966L;
	/**
	 * 缴费记录ID
	 */
	@JsonIgnore
	private String settlementId;
	/**
	 * 车架号
	 */
	@JsonIgnore
	private String vin;
	/**
	 * 服务项ID
	 */
	@JsonProperty("serviceid")
	private String serviceId;
	
	/**
	 * 服务项名称
	 */
	@JsonProperty("servicename")
	private String serviceName;
	/**
	 * 计费代码
	 */
	@JsonProperty("feecode")
	private String feeCode;
	/**
	 * 计费项名称
	 */
	@JsonProperty("feename")
	private String feeName;
	/**
	 * 支付日期
	 */
	@JsonProperty("paydate")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	private Date payDate;
	/**
	 * 支付金额
	 */
	@JsonProperty("payamount")
	private String payAmount;
	/**
	 * 支付状态 1:"未支付", 2:"支付处理中", 3:"支付成功", 4:"支付失败"
	 */
	@JsonProperty("paystatus")
	private int payStatus;
	/**
	 * 支付方式
	 */
	@JsonIgnore
	private int payMethod;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;
	
	public String getSettlementId() {
		return settlementId;
	}
	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getFeeCode() {
		return feeCode;
	}
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public int getPayMethod() {
		return payMethod;
	}
	public void setPayMethod(int payMethod) {
		this.payMethod = payMethod;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getFeeName() {
		return feeName;
	}
	public void setFeeName(String feeName) {
		this.feeName = feeName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n settlementId:");
		builder.append(settlementId);
		builder.append(", \n vin:");
		builder.append(vin);
		builder.append(", \n serviceId:");
		builder.append(serviceId);
		builder.append(", \n serviceName:");
		builder.append(serviceName);
		builder.append(", \n feeCode:");
		builder.append(feeCode);
		builder.append(", \n feeName:");
		builder.append(feeName);
		builder.append(", \n payDate:");
		builder.append(payDate);
		builder.append(", \n payAmount:");
		builder.append(payAmount);
		builder.append(", \n payStatus:");
		builder.append(payStatus);
		builder.append(", \n payMethod:");
		builder.append(payMethod);
		builder.append(", \n addTime:");
		builder.append(addTime);
		builder.append("\n}");
		return builder.toString();
	}
	
}
