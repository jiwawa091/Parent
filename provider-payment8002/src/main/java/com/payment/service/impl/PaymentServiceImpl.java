package com.payment.service.impl;

import cloud.common.entity.Payment;
import com.payment.dao.PaymentDao;
import com.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: PaymentServiceImpl
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 插入
     *
     * @param payment 实体
     * @return 影响数
     */
    @Override
    public int addPayment(Payment payment) {
        return paymentDao.addPayment(payment);
    }

    /**
     * 根据id查询记录
     *
     * @param id id
     * @return 实体
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
