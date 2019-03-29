package com.jcoffee.oauth.service.impl;

import com.jcoffee.commons.basics.constant.CommonConstant;
import com.jcoffee.commons.basics.constant.SecurityConstants;
import com.jcoffee.commons.basics.model.Result;
import com.jcoffee.commons.redis.template.RedisRepository;
import com.jcoffee.database.auth.client.entity.Client;
import com.jcoffee.database.auth.client.mapper.ClientMapper;
import com.jcoffee.oauth.service.IClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Slf4j
@Service
public class ClientServiceImpl implements IClientService {
    private final static String LOCK_KEY_CLIENTID = CommonConstant.LOCK_KEY_PREFIX+"clientId:";

    @Autowired
    private RedisRepository redisRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public Result saveClient(Client client) {
        client.setClientSecret(passwordEncoder.encode(client.getClientSecretStr()));
        String clientId = client.getClientId();
        clientMapper.save(client);
        // 写入redis缓存
        redisRepository.set(clientRedisKey(client.getClientId()), client);
        return Result.success();
    }

    @Override
    public List<Client> listClent(Map<String, Object> params, boolean isPage) {
        return  clientMapper.findList(params);
    }

    @Override
    public void delClient(long id) {
        clientMapper.delete(id);
        redisRepository.del(clientRedisKey(null));
    }

    private String clientRedisKey(String clientId) {
        return SecurityConstants.CACHE_CLIENT_KEY + ":" + clientId;
    }
}
