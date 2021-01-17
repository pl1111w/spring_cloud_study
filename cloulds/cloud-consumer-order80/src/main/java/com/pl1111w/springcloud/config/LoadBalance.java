package com.pl1111w.springcloud.config;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @title: pl1111w
 * @description: 自定义轮询策略接口
 * @author: Kris
 * @date 2021/1/17 11:37
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
