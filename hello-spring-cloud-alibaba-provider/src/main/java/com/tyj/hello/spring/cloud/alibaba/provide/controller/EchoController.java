package com.tyj.hello.spring.cloud.alibaba.provide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/echo/{msg}")
    public String echo(@PathVariable("msg") String msg){
        return "Hello Nacos Provider "+msg+" 访问的端口是："+port;
    }
}
