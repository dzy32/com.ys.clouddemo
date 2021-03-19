package com.ys.demo.controller;

import cn.hutool.core.thread.ThreadUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Thread.sleep;

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
    public String getPort(@PathVariable(value = "id") Integer id) throws InterruptedException {

        ThreadUtil.sleep(800);
        return "Server Port "+ serverPort +"----id--"+id;
    }

    @GetMapping("/testA")
    public String testSentinel() {
        return "Server Port "+ serverPort +"----testA--";
    }

}
