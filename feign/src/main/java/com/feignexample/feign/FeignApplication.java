package com.feignexample.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign消费者(自带断路器)
 * 2018年6月15日10:16:22
 * yangzhao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//加上此注解开启Feign功能
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
