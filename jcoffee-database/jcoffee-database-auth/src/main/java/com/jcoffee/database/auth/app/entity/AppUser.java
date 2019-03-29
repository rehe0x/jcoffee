package com.jcoffee.database.auth.app.entity;

import com.jcoffee.database.auth.sys.entity.SysUser;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户实体绑定spring security
 */
@Getter
@Setter
public class AppUser extends SysUser {
    private static final long serialVersionUID = -5886012896705137070L;

}
