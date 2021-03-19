package com.ys.demo.MyHandle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ys.demo.VO.ResultVO;

/**
 * @author ys
 * @date 2021/3/19 17:45
 */
public class MyHandleException {


    public static ResultVO<String> exception1(BlockException ex){

        ResultVO<String> resultVO = new ResultVO<>();
        return resultVO.success(444,"block exception handle ex1","6666");
    }
}
