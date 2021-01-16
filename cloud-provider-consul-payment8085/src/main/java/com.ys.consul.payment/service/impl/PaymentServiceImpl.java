package com.ys.consul.payment.service.impl;



import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.consul.payment.mapper.PaymentMapper;
import com.ys.consul.payment.service.IPaymentService;
import com.ys.demo.entity.Payment;
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
