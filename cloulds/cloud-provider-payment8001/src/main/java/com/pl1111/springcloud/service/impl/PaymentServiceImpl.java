package com.pl1111.springcloud.service.impl;

import com.pl1111.springcloud.dao.PaymentDao;
import com.pl1111.springcloud.service.PaymentService;
import com.pl1111w.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @title: pl1111w
 * @description: TODO
 * @author: Kris
 * @date 2021/1/6 22:25
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
