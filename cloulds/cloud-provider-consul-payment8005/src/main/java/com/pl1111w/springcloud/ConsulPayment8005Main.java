package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: pl1111w
 * @description: consul
 * @author: Kris
 * @date 2021/1/15 23:17
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8005Main {

    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8005Main.class, args);
    }
}
