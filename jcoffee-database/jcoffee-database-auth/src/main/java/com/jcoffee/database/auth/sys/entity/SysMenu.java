package com.jcoffee.database.auth.sys.entity;

import com.jcoffee.commons.basics.model.SuperEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

/**
 * 菜单
 */
@Setter
@Getter
public class SysMenu extends SuperEntity {
	private static final long serialVersionUID = 749360940290141180L;

	private Long parentId;
	private String name;
	private String css;
	private String url;
	private String path;
	private Integer sort;
	private Integer type;
	private Boolean hidden;
	/**
	 * 请求的类型
	 */
	private String pathMethod;

	private List<SysMenu> subMenus;
	private Long roleId;
	private Set<Long> menuIds;


}
