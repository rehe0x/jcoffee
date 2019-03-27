package com.jcoffee.database.mall.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Commodity implements Serializable {

	private static final long serialVersionUID = -1548766081194862371L;

	/**
	 *
	 */
	private Integer id;
	
	/**
	 * 付款后修改已购数量
	 */
	private Integer alreadyPayNum;
	/**
	 * 单次限购数量
	 */
	private Integer limitNum;
	/**
	 * 商品名称
	 */
	private String name;
	/**
	 * 商品介绍
	 */
	private String remark;
	/**
	 * 商品介绍
	 */
	private String shopsImg;
	
	/**
	 * 分享小图片路径
	 */
	private String shareUrl;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 成本价
	 */
	private BigDecimal costPrice;
	/**
	 * 限购数量
	 */
	private Integer restrictionsNum;
	/**
	 * 已购数量
	 */
	private Integer alreadyNum;
	/**
	 * 虚构数量
	 */
	private Integer fictitiousNum;
	
	/**
	 * 版本号
	 */
	private Integer version;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 区域
	 */
	private String area;
	/**
	 * 地标建筑
	 */
	private String landmark;
	/**
	 * 地铁路线
	 */
	private String metro;
	
	/**
	 * 商铺详情图
	 */
	private String detailsImg;
	/**
	 * 商户Id
	 */
	private Integer shopsId;
	
	/**
	 * 商铺名
	 */
	private String shopsName;
	/**
	 * 商铺地址
	 */
	private String shopsArea;
	/**
	 * 海报图
	 */
	private String adImg;
	/**
	 * 商铺联系电话
	 */
	private String shopsMobile;
	/**
	 * 商铺经度
	 */
	private String shopsLongitude;
	/**
	 * 商铺纬度
	 */
	private String shopsLatitude;
	/**
	 * 活动开始时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startTime;
	/**
	 * 活动结束时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endTime;
	/**
	 * 核销开始时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date cancelStartTime;
	/**
	 * 核销结束时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date cancelEndTime;
	/**
	 * 商品须知url图片地址
	 */
	private String noticeImg;
	/**
	 * 商品列表图片url地址
	 */
	private String listImg;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 商品banner图路径
	 */
	private String bannerUrl;
	/**
	 * 游客是否可见：0不可见1可见
	 */
	private Integer hidden;
	/**
	 * 状态：0未上架1上架2下架3过期4删除
	 */
	private Integer state;
	
	/**
	 * 商品类型id
	 */
	private Integer typeId;
	
	/**
	 * 商品名称
	 */
	private String typeName;
	
	/**
	 * 分享后别人购买活动奖励价格，默认按达人价
	 */
	private BigDecimal talent;
	
	/**
	 * 自购价格
	 */
	private BigDecimal ipay;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAlreadyPayNum() {
		return alreadyPayNum;
	}
	public void setAlreadyPayNum(Integer alreadyPayNum) {
		this.alreadyPayNum = alreadyPayNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public Date getCancelStartTime() {
		return cancelStartTime;
	}
	public void setCancelStartTime(Date cancelStartTime) {
		this.cancelStartTime = cancelStartTime;
	}
	public Date getCancelEndTime() {
		return cancelEndTime;
	}
	public void setCancelEndTime(Date cancelEndTime) {
		this.cancelEndTime = cancelEndTime;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getShareUrl() {
		return shareUrl;
	}
	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
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
	public Integer getRestrictionsNum() {
		return restrictionsNum;
	}
	public void setRestrictionsNum(Integer restrictionsNum) {
		this.restrictionsNum = restrictionsNum;
	}
	public Integer getAlreadyNum() {
		return alreadyNum;
	}
	public void setAlreadyNum(Integer alreadyNum) {
		this.alreadyNum = alreadyNum;
	}
	public Integer getFictitiousNum() {
		return fictitiousNum;
	}
	public void setFictitiousNum(Integer fictitiousNum) {
		this.fictitiousNum = fictitiousNum;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getMetro() {
		return metro;
	}
	public void setMetro(String metro) {
		this.metro = metro;
	}
	public Integer getShopsId() {
		return shopsId;
	}
	public void setShopsId(Integer shopsId) {
		this.shopsId = shopsId;
	}
	public String getShopsName() {
		return shopsName;
	}
	public void setShopsName(String shopsName) {
		this.shopsName = shopsName;
	}
	public String getShopsArea() {
		return shopsArea;
	}
	public void setShopsArea(String shopsArea) {
		this.shopsArea = shopsArea;
	}
	public String getShopsMobile() {
		return shopsMobile;
	}
	public void setShopsMobile(String shopsMobile) {
		this.shopsMobile = shopsMobile;
	}
	public String getShopsLongitude() {
		return shopsLongitude;
	}
	public void setShopsLongitude(String shopsLongitude) {
		this.shopsLongitude = shopsLongitude;
	}
	public String getShopsLatitude() {
		return shopsLatitude;
	}
	public void setShopsLatitude(String shopsLatitude) {
		this.shopsLatitude = shopsLatitude;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getNoticeImg() {
		return noticeImg;
	}
	public void setNoticeImg(String noticeImg) {
		this.noticeImg = noticeImg;
	}
	public String getDetailsImg() {
		return detailsImg;
	}
	public void setDetailsImg(String detailsImg) {
		this.detailsImg = detailsImg;
	}
	public String getListImg() {
		return listImg;
	}
	public void setListImg(String listImg) {
		this.listImg = listImg;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	public Integer getHidden() {
		return hidden;
	}
	public void setHidden(Integer hidden) {
		this.hidden = hidden;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public BigDecimal getTalent() {
		return talent;
	}
	public void setTalent(BigDecimal talent) {
		this.talent = talent;
	}
	public BigDecimal getIpay() {
		return ipay;
	}
	public void setIpay(BigDecimal ipay) {
		this.ipay = ipay;
	}
	public String getAdImg() {
		return adImg;
	}
	public void setAdImg(String adImg) {
		this.adImg = adImg;
	}
	public Integer getLimitNum() {
		return limitNum;
	}
	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}
	public String getShopsImg() {
		return shopsImg;
	}
	public void setShopsImg(String shopsImg) {
		this.shopsImg = shopsImg;
	}
}
