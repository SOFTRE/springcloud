package com.xxm.myfilter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Program: IntelliJ IDEA springcloud
 * @Description: TODO
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-11-16 10:29:20 周六
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: V1.0
 */
@Component
public class MyGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1.获取请求对象
        ServerHttpRequest request = exchange.getRequest();
        //2.获取响应对象
        ServerHttpResponse response = exchange.getResponse();
        //3.获取请求参数为token的值，判断是否为1234
        String token = request.getQueryParams().getFirst("token");
        if (StringUtils.isEmpty(token)){
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }
        if (!"1234".equalsIgnoreCase(token)){
            response.setStatusCode(HttpStatus.NOT_FOUND);
            return response.setComplete();
        }
        //4.如果是1234放行，否则直接返回
        return chain.filter(exchange);
    }

    /**
     *定义过滤器执行的顺序
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
