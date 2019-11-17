package com.xxm.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxm.feign.UserFeign;
import com.xxm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-15 20:03:49 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RequestMapping(value = "/feignUser")
public class FeignConsumerController {

    @Autowired
    UserFeign userFeign;

    @RequestMapping(value = "/getUser")
    @HystrixCommand
    public User findById(){
        User user = userFeign.findById();
        User userx = userFeign.findById(12);
        User usery = userFeign.findById(user);
        /**
         * 1.requestMapping中的路径一定要和提供方的路径保持一致
         * 2.方法的参数个数和参数类型要和提供方的保持一致
         * 3.如果参数是path类型一定要声明
         * 4.方法的返回类型一定要和提供方的返回值类型一致
         */
        return user;
    }

}
