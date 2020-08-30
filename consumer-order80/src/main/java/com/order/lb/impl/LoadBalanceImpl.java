package com.order.lb.impl;

import com.order.lb.LoadBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className: LoadBanlanceImpl
 * @author: wangyan
 * @date: 2020/8/30
 **/
@Component
public class LoadBalanceImpl implements LoadBalance {

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int i = getIncrement() % serviceInstances.size();
        return serviceInstances.get(i);
    }

    public final int getIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("第几次访问，次数next" + next);
        return next;
    }
}
