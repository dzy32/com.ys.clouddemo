package com.ys.clouddemo.comsuer.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ys
 * @date 2021/1/18 17:03
 */

@Component
public class MyLb implements LoadBalancer{

    // 获取原子数
    private AtomicInteger atomicInteger = new AtomicInteger(0);


    /**
     * 通过自旋锁获取下标
     * @return
     */
    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 32323232 ? 0 : current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("***第几次访问消费者接口，次数为：" + next);
        return  next;
    }


    /**
     * 简单实现轮询负载均衡算法
     * @param instanceList
     * @return
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> instanceList) {

        // 获取此次使用的微服务提供者实例
        int index= getAndIncrement() % instanceList.size();

        ServiceInstance instance = instanceList.get(index);
        return instance;
    }
}
