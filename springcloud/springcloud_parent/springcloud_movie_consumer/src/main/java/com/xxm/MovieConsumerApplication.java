package com.xxm;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-13 22:29:15 周三
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//开启熔断
@EnableFeignClients//开启feign
public class MovieConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieConsumerApplication.class,args);
    }
    @Bean
    @LoadBalanced//开启restTemplate的负载均衡策略
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
    //设置feign的日志级别，由DEFAULT(none)-->FULL
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
