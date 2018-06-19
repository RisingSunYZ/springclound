package com.registry2example.registry2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 高可用服务注册中心
 * 2018年6月19日17:06:16
 * yangzhao
 */
@EnableEurekaServer
@SpringBootApplication
public class Registry2Application {

	public static void main(String[] args) {
		SpringApplication.run(Registry2Application.class, args);
	}
}
