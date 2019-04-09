package com.jcoffee.oauth.app.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcoffee.database.auth.app.entity.AppUser;
import com.jcoffee.database.auth.app.mapper.AppUserMapper;
import com.jcoffee.oauth.app.service.UserService;
import com.jcoffee.oauth.app.model.LoginAppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program jcoffee 
 * @description:  
 * @author: Horng 
 * @create: 2019/03/29 11:01 
 */
@Service
public class AppUserServiceImpl implements UserService {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public AppUser selectByUsername(String username) {
        return appUserMapper.findByUsername(username);
    }

    @Override
    public LoginAppUser findByUsername(String username) {
        LoginAppUser loginAppUser = null;
        try {
            AppUser appUser = appUserMapper.findByUsername(username);
            loginAppUser = objectMapper.readValue(objectMapper.writeValueAsString(appUser),LoginAppUser.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return loginAppUser;
    }

    @Override
    public LoginAppUser findByMobile(String mobile) {
        LoginAppUser loginAppUser = null;
        try {
            AppUser appUser = appUserMapper.findByMobile(mobile);
            loginAppUser = objectMapper.readValue(objectMapper.writeValueAsString(appUser),LoginAppUser.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return loginAppUser;
    }

    @Override
    public LoginAppUser findByOpenId(String openId) {
        LoginAppUser loginAppUser = null;
        try {
            AppUser appUser = appUserMapper.findByOpenId(openId);
            loginAppUser = objectMapper.readValue(objectMapper.writeValueAsString(appUser),LoginAppUser.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return loginAppUser;
    }
}
