package com.ys.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author YS
 * @data 2021/3/2 21:50
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Value("${service.url}")
    private String serverUrl;


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPaymentPort/{id}")
    public String getPort(@PathVariable("id")Integer id){
        log.info("{}",serverUrl);
        return restTemplate.getForObject(serverUrl+"/payment/getPort/"+id,String.class);
    }
}
