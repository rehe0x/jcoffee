package com.jcoffee.oauth.config;

import com.jcoffee.commons.auth.config.DefaultPasswordConfig;
import com.jcoffee.commons.auth.properties.SecurityProperties;
import com.jcoffee.commons.basics.constant.SecurityConstants;
import com.jcoffee.oauth.authprovider.mobile.MobileAuthenticationSecurityConfig;
import com.jcoffee.oauth.authprovider.openid.OpenIdAuthenticationSecurityConfig;
import com.jcoffee.oauth.handler.AuthExceptionEntryPoint;
import com.jcoffee.oauth.handler.CustomAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import javax.annotation.Resource;

/**
 * spring security配置
 * 在WebSecurityConfigurerAdapter不拦截oauth要开放的资源
 * 
 * @author zlt
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
@Import(DefaultPasswordConfig.class)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationSuccessHandler authenticationSuccessHandler;
	@Autowired
	private AuthenticationFailureHandler authenticationFailureHandler;


	@Resource
	private UserDetailsService userDetailsService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Resource
	private LogoutHandler oauthLogoutHandler;

	@Autowired
	private SecurityProperties securityProperties;

	@Autowired
	private ValidateCodeSecurityConfig validateCodeSecurityConfig;

	@Autowired
	private OpenIdAuthenticationSecurityConfig openIdAuthenticationSecurityConfig;

	@Autowired
	private MobileAuthenticationSecurityConfig mobileAuthenticationSecurityConfig;

	@Autowired
	private CustomAccessDeniedHandler customAccessDeniedHandler;
	@Autowired
	private AuthExceptionEntryPoint authExceptionEntryPoint;

	/**
	 * 这一步的配置是必不可少的，否则SpringBoot会自动配置一个AuthenticationManager,覆盖掉内存中的用户
	 * @return 认证管理对象
	 */
	@Bean
    @Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.requestMatchers().antMatchers(securityProperties.getAuth().getUrls()).and()
		.authorizeRequests()
                    .antMatchers(securityProperties.getIgnore().getUrls())
                    .permitAll()
                    .anyRequest().authenticated()
                    .and()
//                .formLogin()
//                    .loginPage(SecurityConstants.LOGIN_PAGE)
//                    .loginProcessingUrl(SecurityConstants.OAUTH_LOGIN_PRO_URL)
//                    .successHandler(authenticationSuccessHandler)
//                    .failureHandler(authenticationFailureHandler)
//                    .and()
				.logout()
					.logoutUrl(SecurityConstants.LOGOUT_URL)
					.logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler())
					.addLogoutHandler(oauthLogoutHandler)
					.clearAuthentication(true)
					.and()
                .apply(validateCodeSecurityConfig)
                    .and()
                .apply(openIdAuthenticationSecurityConfig)
                    .and()
				.apply(mobileAuthenticationSecurityConfig)
					.and()
                .csrf().disable()
				// 解决不允许显示在iframe的问题
				.headers().frameOptions().disable().cacheControl();
			http.exceptionHandling().accessDeniedHandler(customAccessDeniedHandler)
				.authenticationEntryPoint(authExceptionEntryPoint);
			http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	}

	/**
	 * 全局用户信息
	 */
	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}
}
