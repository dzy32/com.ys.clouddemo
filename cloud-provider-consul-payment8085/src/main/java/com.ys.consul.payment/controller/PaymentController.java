package com.ys.consul.payment.controller;


import com.ys.consul.payment.service.IPaymentService;
import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ys
 * @since 2021-01-08
 */
@RestController
@RequestMapping("/payment/payment")
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/add")
    public ResultVO insert(@RequestBody Payment payment){
        ResultVO<Payment> resultVO  =new ResultVO<>();
        paymentService.save(payment);
        return resultVO.success(200,"success, port:"+serverPort, payment);
    }

    @GetMapping("/get/{id}")
    public ResultVO getById(@PathVariable(value = "id") Integer id){
        ResultVO<Payment> resultVO  =new ResultVO<>();
        Payment payment = paymentService.getById(id);
        return resultVO.success(200,"success, port:"+serverPort, payment);
    }

    @GetMapping("/get/consul")
    public ResultVO getById(){
        ResultVO<Payment> resultVO  =new ResultVO<>();
        return resultVO.success(200,"payment consul success, port:"+serverPort, null);
    }

}
