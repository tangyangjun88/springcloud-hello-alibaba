package com.tyj.hello.spring.cloud.alibaba.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo/{msg}")
    public String echo(@PathVariable("msg") String msg){
        return "Hello Nacos Provider "+msg;
    }
}
