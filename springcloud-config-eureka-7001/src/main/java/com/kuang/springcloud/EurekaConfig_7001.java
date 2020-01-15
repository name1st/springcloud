package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wonders on 2020-01-15 10:50
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaConfig_7001 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaConfig_7001.class,args);
    }
}


