package com.pl1111w.springcloud.service;
import com.pl1111w.springcloud.entities.CommonResult;
import com.pl1111w.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * 
 * @date 2020/3/25 9:06
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，------------PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
