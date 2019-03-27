package com.jcoffee.database.mall.entity;

import java.io.Serializable;
import java.util.Date;

public class CommodityType implements Serializable {

	private static final long serialVersionUID = 741431373269117134L;
	/**
	 * 
	 */
	private Integer id;
	/**
	 * 类型名称
	 */
	private String name;
	/**
	 * 上级id
	 */
	private Integer parentId;
	/**
	 * 上级类型名称
	 */
	private String parentName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 状态0正常1删除
	 */
	private Integer state;

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

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
