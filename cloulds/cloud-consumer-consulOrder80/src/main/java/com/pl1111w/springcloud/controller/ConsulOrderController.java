package com.pl1111w.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/7 21:37
 */
@RestController
@Slf4j
@RequestMapping("consumer/payment/")
public class ConsulOrderController {

    private static final String URL = "http://consul-payment-service/";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consul")
    public String ZkOrder() {
        String result = restTemplate.getForObject(URL + "/payment/consul", String.class);
        return result;
    }
}
