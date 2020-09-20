package com.dounion.dosmart.login.entity;

/**
 * 对象功能: 人员 实体类 开发公司: doframework.com 开发人员: system 创建时间: 2017-05-24
 */
public class UcenterUser implements BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private String account; //账号

	private String password; //密码
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
