package com.jcoffee.config;

import com.jcoffee.commons.basics.util.port.PortApplicationEnvironmentPreparedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class JcoffeeConfigApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JcoffeeConfigApplication.class);
        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
        app.run(args);
    }

}
