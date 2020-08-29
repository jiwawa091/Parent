package com.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: Payment8004Application
 * @author: wangyan
 * @date: 2020/8/29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004Application.class, args);
    }
}
