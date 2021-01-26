package com.pl1111w.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @title: pl1111w
 * @description: 配置中心启动类
 * @author: Kris
 * @date 2021/1/26 21:05
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3344.class, args);
    }
}
