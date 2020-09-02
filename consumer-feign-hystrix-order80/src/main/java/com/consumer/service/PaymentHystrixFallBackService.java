package com.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @className: PaymentHystrixFallBackService
 * @author: wangyan
 * @date: 2020/9/2
 **/
@Component
public class PaymentHystrixFallBackService implements PaymentHystrixService {
    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "pament fallback ---------------ok" + id;
    }

    /**
     * 超时访问
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "pament fallback ---------------timeout" + id;
    }
}
