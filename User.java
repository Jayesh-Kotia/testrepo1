package com.yash.cmsapp.domain;

public class User extends Person{
	/**
	 * @autor jayesh
	 * user data 
	 */
	
	private int status;
	/**
	 * this is the role of the user to which it belong
	 */
	private int role;
	
	/**
	 * this is the login name of the user
	 */
	private String loginName;
	
	/**
	 * this is password of the user to login in  app
	 */
	private String password;
	
	/**
	 * Login name of user
	 * @return name of user
	 */
	
	/**
	 * password of user
	 * @return the password of user
	 */
	public String getPassword() {
		return password;
	}
	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * password of user
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * status of user
	 * @return statsus of user
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * status of user
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * role of user
	 * @return the role of user
	 */
	public int getRole() {
		return role;
	}
	
	/**
	 * role of user
	 * @param role
	 */
	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [status=" + status + ", role=" + role + ", loginName=" + loginName + ", password=" + password
				+ "]";
	}
	

}
