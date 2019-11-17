package com.xxm.myfilter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.factory.AbstractNameValueGatewayFilterFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: 自定义局部过滤器，使用的时候需要在yml中配置，过滤器名，name,value
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-16 10:53:29 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Component
public class MyParamGatewayFilterFactory extends AbstractNameValueGatewayFilterFactory {
    @Override
    public GatewayFilter apply(NameValueConfig config) {
        return new GatewayFilter() {
            @Override
            public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
                //实现业务逻辑
                //1.获取配置文件中的配置头信息，头的名称
                String name = config.getName();
                //2.获取配置文件中的头对应的值信息，
                String value = config.getValue();
                System.out.println("header的名称："+name);
                System.out.println("header的名称对应的值："+value);
                //3.将头名和头名对应的值，设置在请求头，转发到下一个微服务中
                System.out.println("模拟将头信息设置到头中");
                return chain.filter(exchange);
            }
        };
    }
}
