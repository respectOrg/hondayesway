package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User implements Serializable {
	private static final long serialVersionUID = -5496728967664794420L;
	/**
	 * 车架号
	 */
	@JsonProperty("vin")
	private String vin;
	/**
	 * 车牌号
	 */
	@JsonProperty("plateno")
	private String plateNo;
	/**
	 * 激活状态 0未激活，1已激活
	 */
	@JsonProperty("activatestatus")
	private int activateStatus;
	/**
	 * 激活时间
	 */
	@JsonProperty("activatetime")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	private Date activateTime;
	/**
	 * 名
	 */
	@JsonProperty("firstname")
	private String firstName;
	/**
	 * 姓
	 */
	@JsonProperty("lastname")
	private String lastName;
	/**
	 * 性别  F/M
	 */
	@JsonProperty("gender")
	private String gender;
	/**
	 * 生日 yyyy-MM-dd
	 */
	@JsonProperty("birthday")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date birthday;
	/**
	 * 电子邮件
	 */
	@JsonProperty("email")
	private String email;
	/**
	 * 联系电话 
	 */
	@JsonProperty("phonenumber1")
	private String phoneNumber1;
	@JsonProperty("phonenumber2")
	private String phoneNumber2;
	@JsonProperty("phonenumber3")
	private String phoneNumber3;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public int getActivateStatus() {
		return activateStatus;
	}
	public void setActivateStatus(int activateStatus) {
		this.activateStatus = activateStatus;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}
	public String getPhoneNumber3() {
		return phoneNumber3;
	}
	public void setPhoneNumber3(String phoneNumber3) {
		this.phoneNumber3 = phoneNumber3;
	}
	public Date getActivateTime() {
		return activateTime;
	}
	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
		builder.append("{\n  vin:").append(vin).append(",\n  plateNo:").append(plateNo).append(",\n  activateStatus:").append(activateStatus).append(",\n  activateTime:").append(activateTime).append(",\n  firstName:").append(firstName).append(",\n  lastName:").append(lastName).append(",\n  gender:").append(gender).append(",\n  birthday:").append(birthday).append(",\n  email:").append(email).append(",\n  phoneNumber1:").append(phoneNumber1).append(",\n  phoneNumber2:").append(phoneNumber2).append(",\n  phoneNumber3:").append(phoneNumber3).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}
	
}
