package com.xxm.feign.impl;

import com.xxm.feign.UserFeign;
import com.xxm.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-15 22:42:34 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Component
public class UserFeignImpl implements UserFeign {
    @Override
    public User findById() {
        User user=new User();
        user.setId(11111);
        user.setName("测试feign调用报错，启动熔断，采用后备策略模式返回数据");
        return user;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public User findById(User user) {
        return null;
    }
}
