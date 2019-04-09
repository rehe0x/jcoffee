package com.jcoffee.oauth.app.service;

import com.jcoffee.database.auth.app.entity.AppUser;
import com.jcoffee.oauth.app.model.LoginAppUser;

/**
 *
 */
public interface UserService {
    /**
     * feign rpc访问远程/users/{username}接口
     * 查询用户实体对象SysUser
     *
     * @param username
     * @return
     */
    AppUser selectByUsername(String username);

    /**
     * feign rpc访问远程/users-anon/login接口
     *
     * @param username
     * @return
     */
    LoginAppUser findByUsername(String username);

    /**
     * 通过手机号查询用户、角色信息
     *
     * @param mobile 手机号
     */
    LoginAppUser findByMobile(String mobile);

    /**
     * 根据OpenId查询用户信息
     *
     * @param openId openId
     */
    LoginAppUser findByOpenId(String openId);
}
