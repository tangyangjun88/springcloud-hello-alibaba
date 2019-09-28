package com.tyj.hello.spring.cloud.alibaba.consumer.service.impl;

import com.tyj.hello.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String str) {
        return "你的网络出现了问题";
    }
}
