package com.w.data;

/**
 * Diyu entity. @author MyEclipse Persistence Tools
 */

public class Diyu implements java.io.Serializable {

	// Fields

	private String code;
	private String title;
	private String f3;

	// Constructors

	/** default constructor */
	public Diyu() {
	}

	/** minimal constructor */
	public Diyu(String code) {
		this.code = code;
	}

	/** full constructor */
	public Diyu(String code, String title, String f3) {
		this.code = code;
		this.title = title;
		this.f3 = f3;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getF3() {
		return f3;
	}

	public void setF3(String f3) {
		this.f3 = f3;
	}

	// Property accessors

 

}