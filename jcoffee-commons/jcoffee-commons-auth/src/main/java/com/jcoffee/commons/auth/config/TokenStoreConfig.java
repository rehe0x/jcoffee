package com.jcoffee.commons.auth.config;

import com.jcoffee.commons.auth.store.AuthDbTokenStore;
import com.jcoffee.commons.auth.store.AuthJwtTokenStore;
import com.jcoffee.commons.auth.store.AuthRedisTokenStore;
import com.jcoffee.commons.auth.store.ResJwtTokenStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * token存储配置
 *
 * @author zlt
 */
@Configuration
public class TokenStoreConfig {
    @Configuration
    @ConditionalOnProperty(prefix = "jcoffee.oauth2.token.store", name = "type", havingValue = "db")
    @Import(AuthDbTokenStore.class)
    public class JdbcTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "jcoffee.oauth2.token.store", name = "type", havingValue = "redis", matchIfMissing = true)
    @Import(AuthRedisTokenStore.class)
    public class RedisTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "jcoffee.oauth2.token.store", name = "type", havingValue = "authJwt")
    @Import(AuthJwtTokenStore.class)
    public class AuthJwtTokenConfig {
    }

    @Configuration
    @ConditionalOnProperty(prefix = "jcoffee.oauth2.token.store", name = "type", havingValue = "resJwt")
    @Import(ResJwtTokenStore.class)
    public class ResJwtTokenConfig {
    }
}
