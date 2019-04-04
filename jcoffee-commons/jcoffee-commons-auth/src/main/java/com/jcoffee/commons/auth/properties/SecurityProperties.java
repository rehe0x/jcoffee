package com.jcoffee.commons.auth.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author no
 * @date 2019/1/4
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "jcoffee.security")
@RefreshScope
public class SecurityProperties {
    
    private AuthProperties auth = new AuthProperties();

    private PermitProperties ignore = new PermitProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();
}
