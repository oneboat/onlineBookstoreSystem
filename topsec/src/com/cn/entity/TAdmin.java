package com.cn.entity;

/**
 * TAdmin generated by MyEclipse Persistence Tools
 */

public class TAdmin implements java.io.Serializable {

	// Fields

	private Integer userId;

	@Override
	public String toString() {
		return "TAdmin [userId=" + userId + ", userName=" + userName
				+ ", userPw=" + userPw + "]";
	}

	private String userName;

	private String userPw;

	// Constructors

	/** default constructor */
	public TAdmin() {
	}

	/** full constructor */
	public TAdmin(String userName, String userPw) {
		this.userName = userName;
		this.userPw = userPw;
	}

	// Property accessors

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPw() {
		return this.userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}