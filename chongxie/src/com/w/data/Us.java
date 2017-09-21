package com.w.data;

/**
 * Us entity. @author MyEclipse Persistence Tools
 */

public class Us implements java.io.Serializable {

	// Fields

	private String id;
	private String pwd;
	private String username;
	private String jiaose;
	private String quancheng;

	// Constructors

	/** default constructor */
	public Us() {
	}

	/** minimal constructor */
	public Us(String id, String pwd, String username) {
		this.id = id;
		this.pwd = pwd;
		this.username = username;
	}

	/** full constructor */
	public Us(String id, String pwd, String username, String jiaose,
			String quancheng) {
		this.id = id;
		this.pwd = pwd;
		this.username = username;
		this.jiaose = jiaose;
		this.quancheng = quancheng;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJiaose() {
		return this.jiaose;
	}

	public void setJiaose(String jiaose) {
		this.jiaose = jiaose;
	}

	public String getQuancheng() {
		return this.quancheng;
	}

	public void setQuancheng(String quancheng) {
		this.quancheng = quancheng;
	}

}