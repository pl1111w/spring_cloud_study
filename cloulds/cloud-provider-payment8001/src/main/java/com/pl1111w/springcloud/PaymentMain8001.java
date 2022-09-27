package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title: pl1111w
 * @description: 支付模块启动类
 * @author: Kris
 * @date 2021/1/6 22:21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//可以获取注册到eureka服务的信息 例如：ip 端口
public class PaymentMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
