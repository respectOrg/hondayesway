package cn.yesway.hondayesway.vo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientApp implements Serializable {
	private static final long serialVersionUID = -4092722351859355659L;
	
	/**
	 * APP标识 
	 */
	@JsonProperty("appid")
	private String appId;
	/**
	 * APP名称
	 */
	@JsonProperty("appname")
	private String appName;
	/**
	 * 版本号
	 */
	@JsonProperty("version")
	private int version;
	/**
	 * 版本名称
	 */
	@JsonProperty("versionname")
	private String versionName;
	/**
	 * 最低兼容版本号
	 */
	@JsonProperty("lowestversion")
	private int lowestVersion;
	/**
	 * 版本说明
	 */
	@JsonProperty("introduction")
	private String introduction;
	/**
	 * 下载地址
	 */
	@JsonProperty("downloadurl")
	private String downloadUrl;
	/**
	 * 文件大小
	 */
	@JsonProperty("filesize")
	private String fileSize;
	/**
	 * 发布时间
	 */
	@JsonProperty("updatetime")
	@JsonFormat(timezone="GMT+8", pattern="yyyy-MM-dd")
	private Date updateTime;
	/**
	 * 添加时间
	 */
	@JsonIgnore
	private Date addTime;

	
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public int getLowestVersion() {
		return lowestVersion;
	}
	public void setLowestVersion(int lowestVersion) {
		this.lowestVersion = lowestVersion;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
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
		builder.append("{\n  appId:").append(appId).append(",\n  appName:").append(appName).append(",\n  version:").append(version).append(",\n  versionName:").append(versionName).append(",\n  lowestVersion:").append(lowestVersion).append(",\n  introduction:").append(introduction).append(",\n  downloadUrl:").append(downloadUrl).append(",\n  fileSize:").append(fileSize).append(",\n  updateTime:").append(updateTime).append(",\n  addTime:").append(addTime).append("\n}");
		return builder.toString();
	}
}
