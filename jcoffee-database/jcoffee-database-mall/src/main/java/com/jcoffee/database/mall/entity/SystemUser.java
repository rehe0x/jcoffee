package com.jcoffee.database.mall.entity;


import java.io.Serializable;
import java.util.Date;


public class SystemUser implements Serializable {

	private static final long serialVersionUID = -5759593448787338678L;
	private Integer id;
	/** 
	 * 手机账号
	 */
	private String mobile;
	/**
	 *  密码
	 */
	private String password;
	/**
	 *  姓名
	 */
	private String name;
	/**
	 *  性别
	 */
	private String gender;
	/**
	 *  创建用户
	 */
	private Integer createUserId;
	/**
	 *  创建时间
	 */
	private Date createTime;
	/**
	 * token编号
	 */
	private String token;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
