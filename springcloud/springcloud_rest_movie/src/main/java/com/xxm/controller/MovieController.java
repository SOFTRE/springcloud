package com.xxm.controller;

import com.xxm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 20:30:16 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/look")
    public User look() {
        //模拟浏览器发送请求获取用户信息
        User user =restTemplate.getForObject("http://localhost:8081/user/findByUserId/123",User.class);
        //下单
        System.out.println("下单成功");
        //返回结果
        return user;
    }

}
