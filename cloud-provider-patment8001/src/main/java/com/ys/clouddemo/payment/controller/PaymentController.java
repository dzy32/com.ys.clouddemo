package com.ys.clouddemo.payment.controller;



import com.ys.clouddemo.payment.service.IPaymentService;
import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ys
 * @since 2021-01-08
 */

@Slf4j
@RestController
@RequestMapping("/payment/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public ResultVO insert(@RequestBody Payment payment){
        ResultVO<Payment> resultVO  =new ResultVO<>();
        paymentService.save(payment);
        log.info("32884952======");
        return resultVO.success(200,"success, port:"+serverPort, payment);
    }

    @GetMapping("/get/{id}")
    public ResultVO getById(@PathVariable (value = "id") Integer id){
        ResultVO<Payment> resultVO  =new ResultVO<>();
        Payment payment = paymentService.getById(id);
        log.info("32884952======");
        return resultVO.success(200,"success, port:"+serverPort, payment);
    }

    @GetMapping("/get/sever")
    public Object getServer(){
        discoveryClient.getServices().forEach(service -> {
            log.info("service=={}",service.toString());
        });
        discoveryClient.getInstances("PAYMENT-SERVICE").forEach(serviceInstance -> {
            log.info("host=={}",serviceInstance.getHost());
            log.info("port--{}",serviceInstance.getPort());
            log.info("uri--{}",serviceInstance.getUri());
            log.info("service-name--{}",serviceInstance.getInstanceId());
        });
        return this.discoveryClient;
    }

    @GetMapping("/get/hystrix/pay_info_time_out")
    public String testHysreix(){
        log.info("-----hystrix");
//        int i = 19/0;
        return  paymentService.paymentInfoTimeOut(1);
    }

    @GetMapping("/get/circuit/{id}")
    public String testCircuit(@PathVariable(name = "id") Integer id){
        log.info("-----circuit");
        return  paymentService.paymentInfoCircuitBreaker(id);
    }

}
