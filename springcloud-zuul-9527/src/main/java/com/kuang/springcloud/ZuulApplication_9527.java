package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Created by wonders on 2020-01-13 10:05
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication_9527 {

    public static void main(String[] args) {

        SpringApplication.run(ZuulApplication_9527.class,args);
    }
}
