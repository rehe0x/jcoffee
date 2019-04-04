package com.jcoffee.commons.auth.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

/**
 * 认证服务器使用Redis存取令牌
 * 注意: 需要配置redis参数
 *
 * @author no
 * @date 2018/7/25 9:36
 */
public class AuthRedisTokenStore {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate ;
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;
    @Bean
    public TokenStore tokenStore() {
        RedisTemplateTokenStore redisTemplateStore = new RedisTemplateTokenStore()  ;
        redisTemplateStore.setRedisTemplate(redisTemplate);
        return redisTemplateStore;
       // return new RedisTokenStore(redisConnectionFactory);
    }
}
