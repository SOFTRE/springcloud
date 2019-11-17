package com.xxm.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:32:13 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RequestMapping(value = "/movie")
@DefaultProperties(defaultFallback = "addDefaultFallBack")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/look")
    //@HystrixCommand(fallbackMethod = "addFallBack")//熔断操作，一旦出现错误，调用后备方法
    @HystrixCommand
    public String look(){
        //获取用户信息
        //User user = restTemplate.getForObject("http://localhost:18081/user/findById", User.class);
        /*List<ServiceInstance> instances = discoveryClient.getInstances("USER-PROVIDER");
        ServiceInstance serviceInstance = instances.get(0);
        User user = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/findById", User.class);*/
        //使用ribbon的负载均衡
        User user = restTemplate.getForObject("http://USER-PROVIDER/user/findById", User.class);
        //动态从注册中心获取ip和端口进行调用
        System.out.println("获取的用户名："+user.getUsername());
        //下单
        System.out.println("下单成功");
        //返回结果
        return "success";
    }
    public String addFallBack(){
        System.out.println("获取到了后备的数据");
        return "success";
    }
    public String addDefaultFallBack(){
        System.out.println("获取到了全局后备的数据");
        return "successDefault";
    }
}
