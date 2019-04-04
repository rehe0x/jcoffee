package com.jcoffee.monitor.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableZipkinServer
public class JcoffeeMonitorZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(JcoffeeMonitorZipkinApplication.class, args);
	}

}
