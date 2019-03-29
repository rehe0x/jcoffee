package com.jcoffee.database.auth.sys.entity;

import com.jcoffee.commons.basics.model.SuperEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 管理系统用户实体
 */
@Setter
@Getter
public class SysUser extends SuperEntity {
	private static final long serialVersionUID = -5886012896705137070L;

	private String username;
	private String password;
	private String nickname;
	private String headImgUrl;
	private String mobile;
	private Integer sex;
	private Boolean enabled;
	private String type;
	private String openId;
	private boolean isDel;

	private List<SysRole> roles;
	private String roleId;
	private String oldPassword;
	private String newPassword;
}
