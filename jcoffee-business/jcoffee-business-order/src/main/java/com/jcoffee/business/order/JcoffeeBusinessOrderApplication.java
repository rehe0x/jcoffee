package com.jcoffee.business.order;

import com.jcoffee.commons.basics.util.port.PortApplicationEnvironmentPreparedEventListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan({"com.jcoffee.database.mall.mapper","com.jcoffee.database.order.mapper"})
public class JcoffeeBusinessOrderApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(JcoffeeBusinessOrderApplication.class);
        app.addListeners(new PortApplicationEnvironmentPreparedEventListener());
        app.run(args);

    }

}
