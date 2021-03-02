package com.ys.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YS
 * @data 2021/3/2 21:50
 */

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getPort/{id}")
    public String getPort(@PathVariable(value = "id")Integer id){
        return "Server Port "+ serverPort +"----id--"+id;
    }
}
