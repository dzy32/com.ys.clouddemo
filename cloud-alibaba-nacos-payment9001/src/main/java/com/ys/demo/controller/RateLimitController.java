package com.ys.demo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ys.demo.MyHandle.MyHandleException;
import com.ys.demo.VO.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ys
 * @date 2021/3/19 17:14
 */

@RestController
@RequestMapping("/test")
@Slf4j
public class RateLimitController {

    @GetMapping("/ByResource")
    @SentinelResource(value = "byResource",blockHandler = "exception1",blockHandlerClass = MyHandleException.class)
    public ResultVO<String> testResource(){
        ResultVO<String> resultVO = new ResultVO<>();
        return resultVO.success(200,"test resource success","6666");
    }

    public ResultVO<String> handle_de(BlockException ex){
        ResultVO<String> resultVO = new ResultVO<>();
        return resultVO.success(444,"test resource limit handle",ex.getMessage());
    }


}
