package com.ribbonexample.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RIbbonService {

    @Autowired
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "addServiceFallback")//处理熔断
    public String add(Integer a,  Integer b) {
        return restTemplate.getForObject("http://service-provider/add?a="+a+"&b="+b, String.class);//url指定调用的服务以及接口
    }

    //放生错误进入熔断方法
    //com.netflix.hystrix.contrib.javanica.exception.FallbackDefinitionException(add方法要和熔断方法参数一致)
    public String addServiceFallback(Integer a,  Integer b) {
        return a+b+"error";
    }
}
