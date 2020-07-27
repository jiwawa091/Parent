package com.payment.controller;

import cloud.common.entity.CommonResult;
import cloud.common.entity.Payment;
import com.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @className: PaymentController
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Slf4j
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult creat(@RequestBody Payment payment) {
        payment.setCreateBy("你爸比");
        int row = paymentService.addPayment(payment);
        if (row > 0) {
            return new CommonResult<>(200, "插入数据成功:" + serverPort, row);
        } else {
            return new CommonResult<>(444, "插入数据失败啊", row);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (Objects.isNull(payment)) {
            return new CommonResult(444, "未查询到数据");
        }
        return new CommonResult<>(200, "查询成功:" + serverPort, payment);
    }
}
