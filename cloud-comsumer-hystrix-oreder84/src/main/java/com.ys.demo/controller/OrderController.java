package com.ys.demo.controller;


import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import com.ys.demo.feignService.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author ys
 * @date 2021/1/11 9:36
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {




    @Autowired
    private PaymentService paymentService;

    private static final String PAYMNET_URL= "http://payment-service";

    @GetMapping("/get/fe/{id}")
    public ResultVO<Payment> testFe(@PathVariable("id") String id){
        return  paymentService.getFeignOrder(id);
    }





}
