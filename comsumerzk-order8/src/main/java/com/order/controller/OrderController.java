package com.order.controller;

import cloud.common.entity.CommonResult;
import cloud.common.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @className: OrderController
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Slf4j
@RestController
public class OrderController {

    //public static final String URL = "http://localhost:8001";
    // 集群提供服务时只传服务提供名称
    public static final String URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/zk")
    public String creat(Payment payment) {
        return restTemplate.postForObject(URL + "/payment/zk", payment, String.class);
    }

}
