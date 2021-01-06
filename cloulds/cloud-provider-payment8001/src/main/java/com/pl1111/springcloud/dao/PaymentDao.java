package com.pl1111.springcloud.dao;

import com.pl1111.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @title: pl1111w
 * @description: 支付dao
 * @author: Kris
 * @date 2021/1/6 22:24
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
