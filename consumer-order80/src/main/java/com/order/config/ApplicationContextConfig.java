package com.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @className: ApplicationContextConfig
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced //负载均衡默认轮询
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
