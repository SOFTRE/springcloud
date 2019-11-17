package com.xxm.service.impl;

import com.xxm.dao.UserDao;
import com.xxm.pojo.User;
import com.xxm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:13:00 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
