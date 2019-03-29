package com.jcoffee.database.auth.app.mapper;

import com.jcoffee.database.auth.app.entity.AppUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
@Mapper
public interface AppUserMapper {
    @Select("select * from app_user where username=#{username}")
    AppUser findByUsername(String username);

    @Select("select * from app_user where mobile=#{mobile}")
    AppUser findByMobile(String mobile);

    @Select("select * from app_user where open_id=#{openid}")
    AppUser findByOpenId(String openid);

    List<AppUser> findAll();

    @Insert("insert into sys_user(id,userName,password,salt,nickName,headUrl,createTime) values(#{id},#{userName},#{password},#{salt},#{nickName},#{headUrl},#{createTime})")
    Integer save(AppUser user);
}
