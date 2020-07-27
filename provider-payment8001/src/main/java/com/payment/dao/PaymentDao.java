package com.payment.dao;

import cloud.common.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 支付流水dao
 *
 * @className: PaymentDao
 * @author: wangyan
 * @date: 2020/7/24
 **/
@Mapper
public interface PaymentDao {

    /**
     * 根据id获取支付流水
     *
     * @param id id
     * @return 支付信息
     */
    @Select("select * from payment where id =#{id}")
    Payment getPaymentById(Long id);

    /**
     * 插入支付流水信息
     *
     * @param payment 支付流水实体
     * @return 影响行数
     */
    @Insert("insert into payment(serial, create_at, create_by) VALUES (#{payment.serial},now(),#{payment.createBy})")
    int addPayment(@Param("payment") Payment payment);
}
