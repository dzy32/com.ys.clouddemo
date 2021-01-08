package com.ys.clouddemo.payment.service.impl;

import com.ys.clouddemo.payment.entity.Payment;
import com.ys.clouddemo.payment.mapper.PaymentMapper;
import com.ys.clouddemo.payment.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ys
 * @since 2021-01-08
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
