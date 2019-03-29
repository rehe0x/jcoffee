package com.jcoffee.database.auth.sys.mapper;


import com.jcoffee.database.auth.sys.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
@Mapper
public interface SysRoleMapper {

    @Select("select sr.* from sys_role sr inner join sys_user_role sur on sr.id=sur.rid where sur.uid=#{userId}")
    List<SysRole> findByUserId(String userId);
}
