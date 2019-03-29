package com.jcoffee.oauth.service;

import com.jcoffee.commons.basics.model.Result;
import com.jcoffee.database.auth.client.entity.Client;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface IClientService {
    Result saveClient(Client clientDto);

    /**
     * 查询应用列表
     * @param params
     * @param isPage 是否分页
     */
    List<Client> listClent(Map<String, Object> params, boolean isPage);

    void delClient(long id);
}
