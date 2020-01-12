package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by wonders on 2020-01-08 13:48
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kuang.springcloud"})
@ComponentScan("com.kuang.springcloud")
public class FeignConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer_80.class,args);
    }
}
