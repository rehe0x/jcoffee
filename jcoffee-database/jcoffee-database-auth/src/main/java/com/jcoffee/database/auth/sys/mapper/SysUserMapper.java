package com.jcoffee.database.auth.sys.mapper;

import com.jcoffee.database.auth.sys.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
@Mapper
public interface SysUserMapper {
    @Select("select * from sys_user where userName=#{userName}")
    SysUser findByUserName(String userName);

    List<SysUser> findAll();

    @Insert("insert into sys_user(id,userName,password,salt,nickName,headUrl,createTime) values(#{id},#{userName},#{password},#{salt},#{nickName},#{headUrl},#{createTime})")
    Integer save(SysUser user);
}
