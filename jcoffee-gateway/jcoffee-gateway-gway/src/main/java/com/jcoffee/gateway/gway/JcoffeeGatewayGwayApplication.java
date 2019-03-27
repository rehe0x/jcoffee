package com.jcoffee.gateway.gway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JcoffeeGatewayGwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcoffeeGatewayGwayApplication.class, args);
    }

}
