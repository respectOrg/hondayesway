package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceStatus implements Serializable {

	private static final long serialVersionUID = 2480769777747869911L;
	/**
	 * 服务状态ID
	 */
	@JsonIgnore
	private String serviceStatusId;
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
	 * 服务项说明
	 */
	@JsonProperty("serviceremark")
	private String serviceRemark;
	
	/**
	 * 车架号
	 */
	@JsonIgnore
	private String vin;
	
	/**
	 * 服务状态 0未订购，1正常，2已过期，3 已解约，4即将过期（7天）
	 */
	@JsonProperty("status")
	private int serviceStatus;
	public static class ServiceStatusType{
		public final static int NOTACTATATE = 0;
		public final static int NORMAL = 1;
		public final static int OUTOFDATE = 2;
		public final static int CANCEL = 3;
		public final static int OUTOFDATESOON = 4;
	}
	
	/**
	 * 服务开始时间
	 */
	@JsonProperty("startdate")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date startDate;
	/**
	 * 解约时间
	 */
	@JsonProperty("canceldate")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date cancelDate;
	/**
	 * 服务结束时间
	 */
	@JsonProperty("enddate")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date endDate;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;
	
	public String getServiceStatusId() {
		return serviceStatusId;
	}
	public void setServiceStatusId(String serviceStatusId) {
		this.serviceStatusId = serviceStatusId;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public int getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(int serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getServiceRemark() {
		return serviceRemark;
	}
	public void setServiceRemark(String serviceRemark) {
		this.serviceRemark = serviceRemark;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n  serviceStatusId:").append(serviceStatusId).append(",\n  serviceId:").append(serviceId).append(",\n  serviceName:").append(serviceName).append(",\n  serviceRemark:").append(serviceRemark).append(",\n  vin:").append(vin).append(",\n  serviceStatus:").append(serviceStatus).append(",\n  startDate:").append(startDate).append(",\n  cancelDate:").append(cancelDate).append(",\n  endDate:").append(endDate).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}
	
}
