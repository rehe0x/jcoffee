package com.jcoffee.database.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderCoupon implements Serializable {

	private static final long serialVersionUID = 7024580573128450749L;
	private Integer id;
	/**
	 * 消费劵，付款后生成
	 */
	private String consumerCoupon;
	/**
	 * 状态0未使用1使用
	 */
	private Integer state;
	/**
	 * 核销时间
	 */
	private Date checkTime;
	/**
	 * 核销商户openid
	 */
	private String checkOpenid;
	/**
	 * 订单id
	 */
	private Integer orderId;
	/**
	 * 订单号
	 */
	private String orderNumber;
	/**
	 * 商铺id
	 */
	private Integer shopsId;
	/**
	 * 商品id
	 */
	private Integer commodityId;
	/**
	 * 商品名称
	 */
	private String commodityName;
	
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 是否提款：1不可提2可提3已提
	 */
	private Integer take;
	/**
	 * 单价
	 */
	private BigDecimal price;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 上级达人openid
	 */
	private String parentOpenid;
	
	/**
	 * 付款人openid
	 */
	private String openid;
	/**
	 * 核销结束时间
	 */
	private Date cancelEndTime;
	/**
	 * 商品列表图片url地址
	 */
	private String listImg;
	/**
	 * 商品介绍
	 */
	private String remark;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 名字
	 */
	private String nickName;
	/**
	 * 佣金
	 */
	private BigDecimal commission;
	/**
	 * 奖金
	 */
	private BigDecimal bonus;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConsumerCoupon() {
		return this.consumerCoupon;
	}

	public void setConsumerCoupon(String consumerCoupon) {
		this.consumerCoupon = consumerCoupon;
	}

	public String getOpenid() {
		return openid;
	}

	public Date getCancelEndTime() {
		return cancelEndTime;
	}

	public void setCancelEndTime(Date cancelEndTime) {
		this.cancelEndTime = cancelEndTime;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckOpenid() {
		return this.checkOpenid;
	}

	public void setCheckOpenid(String checkOpenid) {
		this.checkOpenid = checkOpenid;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Integer getShopsId() {
		return this.shopsId;
	}

	public void setShopsId(Integer shopsId) {
		this.shopsId = shopsId;
	}

	public BigDecimal getCommission() {
		return commission;
	}

	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public Integer getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getCommodityName() {
		return this.commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getListImg() {
		return listImg;
	}

	public void setListImg(String listImg) {
		this.listImg = listImg;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getParentOpenid() {
		return parentOpenid;
	}

	public void setParentOpenid(String parentOpenid) {
		this.parentOpenid = parentOpenid;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getTake() {
		return take;
	}

	public void setTake(Integer take) {
		this.take = take;
	}
}
