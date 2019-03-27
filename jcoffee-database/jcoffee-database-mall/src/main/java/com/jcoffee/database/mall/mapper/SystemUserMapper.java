package com.jcoffee.database.mall.mapper;

import com.jcoffee.database.mall.entity.SystemUser;
import org.springframework.stereotype.Repository;



@Repository
public interface SystemUserMapper {
	public SystemUser login(String mobile) throws Exception;
}
