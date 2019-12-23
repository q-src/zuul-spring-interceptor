package com.github.qsrc.zsi.example.proxy;

import com.github.qsrc.zsi.annotation.Interceptor;
import com.github.qsrc.zsi.annotation.RequestInterceptor;
import com.github.qsrc.zsi.annotation.ResponseInterceptor;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;

@Interceptor
public class SimpleInterceptor {

    @RequestInterceptor
    public void intercept(ServerHttpRequest request) {

        request.getId();
    }

    @ResponseInterceptor
    public void intercept(ServerHttpResponse response) {

    }

}
