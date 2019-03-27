package com.jcoffee.database.mall.entity;

import java.io.Serializable;
import java.util.Date;


public class Banner implements Serializable {

	private static final long serialVersionUID = -1273791074994521243L;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 图片地址
	 */
	private String path;
	/**
	 * 跳转地址
	 */
	private String url;
	/**
	 * 状态0未上架1上架2删除
	 */
	private Integer state = 0;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
