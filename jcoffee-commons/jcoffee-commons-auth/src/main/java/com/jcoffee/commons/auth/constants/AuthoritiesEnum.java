package com.jcoffee.commons.auth.constants;

/**
 * 权限常量
 *
 * @author no
 * @date 2018/7/24 16:05
 */
public enum AuthoritiesEnum {
    /**
     * 管理员
     */
    ADMIN("ROLE_ADMIN"),
    /**
     * 普通用户
     */
    USER("ROLE_USER"),
    /**
     * 匿名用户
     */
    ANONYMOUS("ROLE_ANONYMOUS");

    private String role;

    AuthoritiesEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
