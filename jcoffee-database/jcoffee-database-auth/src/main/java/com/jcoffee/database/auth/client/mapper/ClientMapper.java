package com.jcoffee.database.auth.client.mapper;

import com.jcoffee.database.auth.client.entity.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClientMapper {
    @Select("select * from oauth_client_details")
    List<Client> findList(@Param("params") Map<String, Object> params);

    void save(Client client);

    Integer delete(Long id);
}
