package com.ys.demo.controller;


import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import com.ys.demo.feignService.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

/**
 * @author ys
 * @date 2021/1/11 9:36
 */


@RestController
@RequestMapping("/order")
@Slf4j
//@DefaultProperties(defaultFallback = "gloableHandler")
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    private static final String PAYMNET_URL= "http://payment-service";

    @GetMapping("/get/fe/{id}")
    public ResultVO<Payment> testFe(@PathVariable("id") String id){
        return  paymentService.getFeignOrder(id);
    }


    /**
     * commandProperties 该注解的意思是此次请求如果超过设定的毫秒数的话则执行 fallbacMethod的方法，从而实现降级处理
     *
     * @return
     */

//    @HystrixCommand(fallbackMethod = "paymentInfoTimeOutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "8000")
//    })
//    @HystrixCommand
    @GetMapping("/get/hystrix")
    public String paymentInfoTimeOut() {

        return paymentService.getFeignHystix();
    }

    public String paymentInfoTimeOutHandler() {
        return "订单服务降级模拟----orderInfo Time out handler show" + Thread.currentThread().getName() + "id:" ;
    }
    public String gloableHandler() {
        return "全局降级处理模拟----orderInfo Time out handler show" + Thread.currentThread().getName() + "id:" ;
    }




}
