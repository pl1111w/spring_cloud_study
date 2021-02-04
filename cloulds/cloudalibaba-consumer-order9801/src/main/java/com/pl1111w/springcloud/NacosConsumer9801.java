package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/2/4 22:47
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer9801 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer9801.class, args);
    }
}
