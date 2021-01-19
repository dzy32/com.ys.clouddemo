package com.ys.demo.feignService;

import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ys
 * @date 2021/1/19 15:11
 */

@Component
@FeignClient(value = "payment-service")
public interface PaymentService {

    @GetMapping(value = "/payment/payment/get/{id}")
    ResultVO<Payment> getFeignOrder(@PathVariable("id") String id);
}
