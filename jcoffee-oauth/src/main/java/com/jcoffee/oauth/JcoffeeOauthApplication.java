package com.jcoffee.oauth;

import com.jcoffee.commons.basics.util.port.PortApplicationEnvironmentPreparedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan({"com.jcoffee.database.auth.client.mapper","com.jcoffee.database.auth.app.mapper"})
public class JcoffeeOauthApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JcoffeeOauthApplication.class);
        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
        app.run(args);
    }

}
