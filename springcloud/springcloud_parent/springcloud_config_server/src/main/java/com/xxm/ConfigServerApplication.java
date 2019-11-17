package com.xxm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-16 11:21:30 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient//开启Eureka客户端发现功能
@EnableConfigServer//开启配置服务支持
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class,args);
    }
}