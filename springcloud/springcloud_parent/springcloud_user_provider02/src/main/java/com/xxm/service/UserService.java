package com.xxm.service;

import com.xxm.pojo.User;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:12:15 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public interface UserService {
    List<User> findAll();
}
