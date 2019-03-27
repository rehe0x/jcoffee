package com.jcoffee.database.mall.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Shops implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8118932845752474700L;
	/**
	 * 商户Id
	 */
	private Integer id;
	
	/**
	 * 累积订单数
	 */
	private Integer accumulateNum;
	
	/**
	 * 累积金额
	 */
	private BigDecimal accumulateMoney;
	
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 商铺名
	 */
	private String name;
	/**
	 * 联系人电话
	 */
	private String mobile;
	/**
	 * 联系人
	 */
	private String contacts;
	/**
	 * 商铺地址
	 */
	private String area;
	/**
	 * 上级店铺Id
	 */
	private Integer parentId;
	/**
	 * 登录账户
	 */
	private String userName;
	
	/**
	 * 密码
	 */
//	@NotBlank(message = "密码不能为空")
	private String password;
	/**
	 * 店铺电话
	 */
	private String phone;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 状态0正常1删除
	 */
	private Integer state;

	/**
	 * token编号
	 */
	private String token;
	
	/**
	 * 商铺图片
	 */
	private String img;
	
	/**
	 * 登录用户openid
	 */
	private String openid;
	
	/**
	 * 用户登录时IP
	 */
	private String ip;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAccumulateNum() {
		return accumulateNum;
	}

	public void setAccumulateNum(Integer accumulateNum) {
		this.accumulateNum = accumulateNum;
	}

	public BigDecimal getAccumulateMoney() {
		return accumulateMoney;
	}

	public void setAccumulateMoney(BigDecimal accumulateMoney) {
		this.accumulateMoney = accumulateMoney;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
}
