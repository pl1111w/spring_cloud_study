package com.pl1111w.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @title: pl1111w
 * @description: consul测试类
 * @author: Kris
 * @date 2021/1/15 23:23
 */
@RestController
@RequestMapping("/payment")
public class ConsulController {
    @Value("${server.port}")
    private String SERVER_PORT;

    @RequestMapping("/consul")
    public String paymentZK() {
        return "com.com.springcloud with consul :" + SERVER_PORT + "\t" + UUID.randomUUID().toString();
    }
}
