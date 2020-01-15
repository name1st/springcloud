package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by wonders on 2020-01-12 13:00
 */
@SpringBootApplication
@EnableHystrixDashboard //开启
public class HystrixBoradCustomer_9001 {

    public static void main(String[] args) {

        SpringApplication.run(HystrixBoradCustomer_9001.class,args);
    }
}
