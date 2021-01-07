package com.pl1111w.springcloud;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

/**
 * @title: pl1111w
 * @description: 订单调用者启动类
 * @author: Kris
 * @date 2021/1/7 21:32
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
