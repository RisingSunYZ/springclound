package com.feignexample.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class FeignError implements IFeignCustomer {

    @Override
    public String add(@RequestParam(value = "a")Integer a, @RequestParam(value = "b") Integer b){
        return a+b+"errorFeign";
    };
}
