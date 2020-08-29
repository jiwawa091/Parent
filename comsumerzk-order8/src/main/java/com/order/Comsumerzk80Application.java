package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @className: Comsemerzk80Application
 * @author: wangyan
 * @date: 2020/8/29
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Comsumerzk80Application {
    public static void main(String[] args) {
        SpringApplication.run(Comsumerzk80Application.class, args);
    }
}
