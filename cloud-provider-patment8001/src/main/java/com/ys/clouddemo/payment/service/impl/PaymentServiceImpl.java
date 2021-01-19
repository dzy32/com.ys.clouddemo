package com.ys.clouddemo.payment.service.impl;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.ys.clouddemo.payment.mapper.PaymentMapper;
import com.ys.clouddemo.payment.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.demo.entity.Payment;
import org.springframework.cloud.netflix.hystrix.HystrixCommands;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

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

    @Override
    public String paymentInfoOk(Integer id) {
        return null;
    }

    /**
     * commandProperties 该注解的意思是此次请求如果超过设定的毫秒数的话则执行 fallbacMethod的方法，从而实现降级处理
     *
     * @param id
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeOut(Integer id) {
        Integer sleepNum = 5;
        try {
            // 睡眠5秒，超过响应设定值，触发fallback 方法
            TimeUnit.SECONDS.sleep(sleepNum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "当前线程：" + Thread.currentThread().getName() + "payment info time out ,id" + id;
    }

    @Override
    public String paymentInfoTimeOutHandler(Integer id) {
        return "paymentInfo Time out handler show" + Thread.currentThread().getName() + "id:" + id;
    }
}