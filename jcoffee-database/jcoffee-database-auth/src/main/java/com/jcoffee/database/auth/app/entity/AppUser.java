package com.jcoffee.database.auth.app.entity;

import com.jcoffee.database.auth.sys.entity.SysUser;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户实体绑定spring security
 */
@Getter
@Setter
public class AppUser extends SysUser implements Serializable {
    private static final long serialVersionUID = -5886012896705137070L;

}
