package com.tyj.hello.spring.cloud.alibaba.consumer.service;

import com.tyj.hello.spring.cloud.alibaba.consumer.service.impl.EchoServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "nacos-provider" , fallback = EchoServiceImpl.class)
public interface EchoService {
    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str);
}
