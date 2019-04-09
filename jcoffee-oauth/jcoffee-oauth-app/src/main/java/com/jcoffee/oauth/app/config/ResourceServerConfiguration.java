package com.jcoffee.oauth.app.config;

import com.jcoffee.commons.auth.config.TokenStoreConfig;
import com.jcoffee.commons.auth.properties.SecurityProperties;
import com.jcoffee.oauth.app.handler.AuthExceptionEntryPoint;
import com.jcoffee.oauth.app.handler.CustomAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * 资源服务器配置
 *
 * @author no
 * @date 2018/10/27
 */
@Configuration
@EnableResourceServer
@Import(TokenStoreConfig.class)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    private CustomAccessDeniedHandler customAccessDeniedHandler;
    @Autowired
    private AuthExceptionEntryPoint authExceptionEntryPoint;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.authenticationEntryPoint(authExceptionEntryPoint)//token验证失败处理器
                .accessDeniedHandler(customAccessDeniedHandler);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //允许使用iframe 嵌套，避免swagger-ui 不被加载的问题
        http.headers().frameOptions().disable().and()
           // .requestMatchers().antMatchers(securityProperties.getAuth().getUrls()).and()//一级拦截
            .authorizeRequests().antMatchers( //二级拦截
                    securityProperties.getIgnore().getUrls()).permitAll() //需要过滤的资源
            .anyRequest().authenticated(); //除了需要过滤的都要认证

        http.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler)
                .authenticationEntryPoint(authExceptionEntryPoint);
    }
}
