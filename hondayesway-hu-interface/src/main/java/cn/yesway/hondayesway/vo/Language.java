package cn.yesway.hondayesway.vo;
import java.io.Serializable;


public class Language implements Serializable  {
 
	private static final long serialVersionUID = 1L;

	/**
     * @备注:     
     * @字段:Id varchar(36)  
     */	
	private java.lang.String id;

	/**
     * @备注:     
     * @字段:Code varchar(200)  
     */	
	private java.lang.String code;

	/**
     * @备注:     
     * @字段:Language varchar(20)  
     */	
	private java.lang.String language;

	/**
     * @备注:     
     * @字段:Content varchar(2000)  
     */	
	private java.lang.String content;
	public Language(){
	}

	public Language(
		java.lang.String id
	){
		this.id = id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}
	 
	public java.lang.String getId() {
		return this.id;
	}
	public void setCode(java.lang.String code) {
		this.code = code;
	}
	 
	public java.lang.String getCode() {
		return this.code;
	}
	public void setLanguage(java.lang.String language) {
		this.language = language;
	}
	 
	public java.lang.String getLanguage() {
		return this.language;
	}
	public void setContent(java.lang.String content) {
		this.content = content;
	}
	 
	public java.lang.String getContent() {
		return this.content;
	}

	@Override
	public String toString() {
		return "{id: " + id + ", \ncode: " + code + ", \nlanguage: " + language
				+ ", \ncontent: " + content + "}";
	}
	
	
}
