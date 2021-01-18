package com.ys.clouddemo.comsuer.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author ys
 * @date 2021/1/18 17:01
 */

public interface LoadBalancer {

    /**
     * 获取所有微服务提供者实例
     * @param instanceList
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> instanceList);
}
