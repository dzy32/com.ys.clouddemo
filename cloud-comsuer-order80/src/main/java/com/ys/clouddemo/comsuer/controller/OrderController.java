package com.ys.clouddemo.comsuer.controller;



import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
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
    private RestTemplate restTemplate;

    private static final String PAYMNET_URL= "http://PAYMENT-SERVICE";

    @GetMapping("/get/{id}")
    public ResultVO<Payment> getPay(@PathVariable("id") String id){



        return restTemplate.getForObject(PAYMNET_URL.concat("/payment/payment/get/").concat(id),ResultVO.class);
    }

    @PostMapping("/add")
    public ResultVO<Payment> addPay(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMNET_URL.concat("/payment/payment/add"),payment,ResultVO.class);
    }
}
