package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/2/5 22:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3377.class, args);
    }
}
