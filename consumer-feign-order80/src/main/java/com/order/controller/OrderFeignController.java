package com.order.controller;

import cloud.common.entity.CommonResult;
import cloud.common.entity.Payment;
import com.order.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className: OrderFeignController
 * @author: wangyan
 * @date: 2020/8/30
 **/
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "consumer/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "consumer/payment/feign/timeout")
    public String timeOut() {
        // openfeign客户端默认等待1秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }
}
