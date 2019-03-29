package com.jcoffee.database.auth.app.mapper;

import com.jcoffee.database.auth.sys.entity.SysUserRole;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *
 */
@Mapper
public interface AppUserRoleMapper {

    List<SysUserRole> findByuid(int uid);

    @Select(value = "select r.role_name from user_role ur left join role r on ur.rid=r.id where ur.uid = ?")
    List<String> findRoleName(int uid);

    @Insert("insert into sys_user_role(id,uid,rid) values(#{id},#{uid},#{rid})")
    Integer save(SysUserRole sysUserRole);
}
