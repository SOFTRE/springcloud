package com.xxm.dao;

import com.xxm.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:07:55 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
