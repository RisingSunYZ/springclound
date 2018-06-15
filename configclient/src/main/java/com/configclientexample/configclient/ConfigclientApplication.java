package com.configclientexample.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分布式配置中心客户端
 * 2018年6月15日14:21:55
 * yangzhao
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

	@Value("${democonfigclient.message}")
	private String from ;

	@RequestMapping("/from")
	public String from() {
		return this.from ;
	}
}
