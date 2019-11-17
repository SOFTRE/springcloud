package com.xxm.feign;

import com.xxm.feign.impl.UserFeignImpl;
import com.xxm.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-15 19:56:42 周五
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@FeignClient(name = "user-provider",fallback = UserFeignImpl.class)
//声明feign的客户端，指定服务名
public interface UserFeign {
    //声明要调用服务提供者的url
    @RequestMapping(value = "/user/findById")
    User findById();

    @RequestMapping(value = "/user/findById/{id}")
    User findById(@PathVariable(name = "id") Integer id);

    @PostMapping(value = "/user/add")
    User findById(@RequestBody User user);
}
