package com.tyj.hello.spring.cloud.alibaba.consumer.controller;

import com.tyj.hello.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class EchoController {

    @Value("${user.name}")
    private String userName;

    @Autowired
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String msg){
        return echoService.echo(msg);
    }

    @GetMapping("/echo")
    public String echo(){
        return echoService.echo(userName);
    }
}
