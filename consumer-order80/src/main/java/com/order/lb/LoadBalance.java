package com.order.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义负载均衡
 *
 * @className: LoadBanlance
 * @author: wangyan
 * @date: 2020/8/30
 **/
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
