package com.ys.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ys
 * @date 2021/3/23 17:30
 */

@FeignClient(value = "service-nacos-payment")
public interface FeignService {


    @GetMapping("/getPort/{id}")
    public void getProviderPort(@PathVariable(value = "id") Integer id);

}
