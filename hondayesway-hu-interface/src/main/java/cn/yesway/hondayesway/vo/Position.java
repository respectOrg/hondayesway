package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position implements Serializable {
	private static final long serialVersionUID = 2266004251018541400L;
	/**
	 * 记录ID
	 */
	private String positionId;
	/**
	 * 车架号 
	 */
	private String vin;
	/**
	 * 经度
	 */
	private String longitude;
	/**
	 * 纬度
	 */
	private String latitude;
	/**
	 * 速度 0.1km/h
	 */
	private Integer speed;
	/**
	 * 车头朝向<br>0-360°，正北0°，顺时针增加
	 */
	private Integer heading;
	/**
	 * 定位时间
	 */
	private Date locationTime;
	/**
	 * 定位质量，‘A’有效，‘V’和其他值无效
	 */
	private String positionQuality;
	/**
	 * 坐标类型，0：84坐标，1：偏移坐标
	 */
	private int coordType;
	/**
	 * 添加时间
	 */
	private Date addTime;
	
	public String getPositionId() {
		return positionId;
	}
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getHeading() {
		return heading;
	}
	public void setHeading(Integer heading) {
		this.heading = heading;
	}
	public String getPositionQuality() {
		return positionQuality;
	}
	public void setPositionQuality(String positionQuality) {
		this.positionQuality = positionQuality;
	}
	public int getCoordType() {
		return coordType;
	}
	public void setCoordType(int coordType) {
		this.coordType = coordType;
	}
	public Date getLocationTime() {
		return locationTime;
	}
	public void setLocationTime(Date locationTime) {
		this.locationTime = locationTime;
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
		builder.append("{\n  positionId:").append(positionId).append(",\n  vin:").append(vin).append(",\n  longitude:").append(longitude).append(",\n  latitude:").append(latitude).append(",\n  speed:").append(speed).append(",\n  heading:").append(heading).append(",\n  locationTime:").append(locationTime).append(",\n  positionQuality:").append(positionQuality).append(",\n  coordType:").append(coordType).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}
}
