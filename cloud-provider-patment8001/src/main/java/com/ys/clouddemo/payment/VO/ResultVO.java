package com.ys.clouddemo.payment.VO;

import lombok.Data;

/**
 * @author ys
 * @date 2021/1/8 16:28
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;

    public ResultVO success(Integer code, String message, T data){
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        resultVO.setData(data);
        return  resultVO;
    }
}
