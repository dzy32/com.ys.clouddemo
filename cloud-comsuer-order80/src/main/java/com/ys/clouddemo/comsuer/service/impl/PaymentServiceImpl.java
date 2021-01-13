package com.ys.clouddemo.comsuer.service.impl;


import com.ys.clouddemo.comsuer.mapper.PaymentMapper;
import com.ys.clouddemo.comsuer.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
