package com.ys.demo.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ys
 * @since 2021-01-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单流水号
     */
    private String orderId;


}
