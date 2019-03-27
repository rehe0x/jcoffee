package com.jcoffee.database.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Order implements Serializable {
	private static final long serialVersionUID = 7957020076931031188L;
	private Integer id;
	/**
	 * 订单号
	 */
	private String orderNumber;
	/**
	 * appuserid不存数据库
	 * 
	 */
	private Integer userId;
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
	 * 商品列表图片url地址
	 */
	private String listImg;
	/**
	 * 订单状态：1.待支付2.已支付3.已取消4.完成
	 */
	private Integer state;
	
	/**
	 * 版本号
	 */
	private Integer version; 
	/**
	 * 商品介绍
	 */
	private String remark;
	/**
	 * 商品单价
	 */
	private BigDecimal price;
	/**
	 * 成本单价
	 */
	private BigDecimal costPrice;
	/**
	 * 购买数量
	 */
	private Integer purchaseNum;
	
	/**
	 * 下单是是否注册为达人
	 */
	private Integer talent;
	/**
	 * 总共价
	 */
	private BigDecimal totalPrice;
	
	/**
	 * 实际支付金额
	 */
	private BigDecimal actualPrice;
	/**
	 * 微信客户openid
	 */
	private String openid;
	
	/**
	 * 上级达人openid 不存数据库
	 */
	private String parentOpenid;
	
	/**
	 * 上级达人openid 不存数据库
	 */
	private String ip;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 客户姓名
	 */
	private String nickName;
	/**
	 * 付款时间
	 */
	private Date paymentTime;
	
	/**
	 * 核销结束时间
	 */
	private Date cancelEndTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Integer getShopsId() {
		return shopsId;
	}
	public void setShopsId(Integer shopsId) {
		this.shopsId = shopsId;
	}
	public String getParentOpenid() {
		return parentOpenid;
	}
	public void setParentOpenid(String parentOpenid) {
		this.parentOpenid = parentOpenid;
	}
	public Integer getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}
	public Integer getPurchaseNum() {
		return purchaseNum;
	}
	public void setPurchaseNum(Integer purchaseNum) {
		this.purchaseNum = purchaseNum;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getTalent() {
		return talent;
	}
	public void setTalent(Integer talent) {
		this.talent = talent;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	public Date getCancelEndTime() {
		return cancelEndTime;
	}
	public void setCancelEndTime(Date cancelEndTime) {
		this.cancelEndTime = cancelEndTime;
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
	public String getListImg() {
		return listImg;
	}
	public void setListImg(String listImg) {
		this.listImg = listImg;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public BigDecimal getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(BigDecimal actualPrice) {
		this.actualPrice = actualPrice;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", userId="
				+ userId + ", shopsId=" + shopsId + ", commodityId="
				+ commodityId + ", commodityName=" + commodityName
				+ ", listImg=" + listImg + ", state=" + state + ", version="
				+ version + ", remark=" + remark + ", price=" + price
				+ ", costPrice=" + costPrice + ", purchaseNum=" + purchaseNum
				+ ", talent=" + talent + ", totalPrice=" + totalPrice
				+ ", actualPrice=" + actualPrice + ", openid=" + openid
				+ ", parentOpenid=" + parentOpenid + ", ip=" + ip + ", mobile="
				+ mobile + ", nickName=" + nickName + ", paymentTime="
				+ paymentTime + ", cancelEndTime=" + cancelEndTime
				+ ", updateTime=" + updateTime + ", createTime=" + createTime
				+ "]";
	}
}