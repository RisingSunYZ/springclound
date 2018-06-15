package com.ribbonexample.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 服务Ribbon消费
 * 2018年6月15日09:26:54
 * yangzhap
 */
@RestController
@SpringCloudApplication
/**
 * 相当于这三个注解
 * @SpringBootApplication
   @EnableDiscoveryClient
   @EnableCircuitBreaker//开启熔断器(@EnableHystrix)
 */

public class RibbonApplication {

	@Bean
	@LoadBalanced//开启负载均衡
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

}
