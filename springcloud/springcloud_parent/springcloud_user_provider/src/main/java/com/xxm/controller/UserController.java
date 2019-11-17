package com.xxm.controller;

import com.xxm.pojo.User;
import com.xxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:14:15 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RefreshScope
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findById")
    public User findById() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //int i=1/0;
        System.out.println("111111111111");
        return userService.findAll().get(0);
    }

    @RequestMapping(value = "/findById/{id}")
    public User findById(@PathVariable(name = "id") Integer id) {
        System.out.println(id);
        return userService.findAll().get(0);
    }

    @PostMapping(value = "/add")
    public User findById(@RequestBody User user) {
        return userService.findAll().get(0);
    }
}
