package com.pl1111w.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/2/3 22:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/nacos/payment/{id}")
    public String getServerPort(@PathVariable("id") Long id) {
        return serverPort + "--id:" + id;
    }
}
