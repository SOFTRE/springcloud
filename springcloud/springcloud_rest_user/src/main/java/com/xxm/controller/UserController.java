package com.xxm.controller;

import com.xxm.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 20:12:05 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/findByUserId/{id}")
    public User findByUserId(@PathVariable(name = "id") Integer id){
        System.out.println("id"+id);
        User zhangsan=new User(id,"zhangsan");
        return zhangsan;
    }
}
