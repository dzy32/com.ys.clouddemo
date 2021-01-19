package com.ys.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ys.demo.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ys
 * @since 2021-01-08
 */

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
