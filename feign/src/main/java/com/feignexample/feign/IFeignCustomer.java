package com.feignexample.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-PROVIDER" ,fallback = FeignError.class)//指定调用哪个服务 指定熔断回调类实现接口
public interface IFeignCustomer {

    @RequestMapping(value = "/add",method = RequestMethod.GET)//指定接口
    String add(@RequestParam(value = "a")Integer a,@RequestParam(value = "b") Integer b);

}
