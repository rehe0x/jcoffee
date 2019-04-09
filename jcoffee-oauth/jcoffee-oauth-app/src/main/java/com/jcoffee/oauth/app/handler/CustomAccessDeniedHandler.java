package com.jcoffee.oauth.app.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @program security-oauth2
 * @description: 自定义AccessDeniedHandler 异常 好像无效
 * @author: Horng
 * @create: 2018/11/25 17:12
 */
@Component("customAccessDeniedHandler")
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        Map map = new HashMap();
        map.put("error", "401");
        map.put("message", accessDeniedException.getMessage());
        map.put("path", request.getServletPath());
        map.put("timestamp", String.valueOf(new Date().getTime()));
        response.setContentType("application/json");
        if("不允许访问".equals(accessDeniedException.getMessage())){
            response.setStatus(HttpServletResponse.SC_PAYMENT_REQUIRED);
        }else{
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        }
        response.getWriter().write(objectMapper.writeValueAsString(map));
    }
}

