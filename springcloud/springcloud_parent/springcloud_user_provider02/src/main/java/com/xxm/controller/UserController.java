package com.xxm.controller;

import com.xxm.pojo.User;
import com.xxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findById")
    public User findById(){
        System.out.println("222222222222222");
        return userService.findAll().get(0);
    }
}
