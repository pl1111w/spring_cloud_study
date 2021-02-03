package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/2/3 21:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9002.class, args);
    }
}
