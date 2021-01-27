package com.ys.demo.feignService;

import com.ys.demo.VO.ResultVO;
import com.ys.demo.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @author ys
 * @date 2021/1/27 17:24
 */

@Component
public class PaymentFallbackServcie implements PaymentService{
    @Override
    public ResultVO<Payment> getFeignOrder(String id) {
        ResultVO<Payment> resultVO = new ResultVO<>();
        resultVO.setCode(500);
        resultVO.setData(null);
        resultVO.setMessage("order feign error");
        return resultVO;
    }

    @Override
    public String getFeignHystix() {
        return "order feign hystrix error";
    }
}
