package com.payment.service;

import cloud.common.entity.Payment;

/**
 * @className: PaymentService
 * @author: wangyan
 * @date: 2020/7/24
 **/
public interface PaymentService {

    /**
     * 插入
     *
     * @param payment 实体
     * @return 影响数
     */
    int addPayment(Payment payment);

    /**
     * 根据id查询记录
     *
     * @param id id
     * @return 实体
     */
    Payment getPaymentById(Long id);
}
