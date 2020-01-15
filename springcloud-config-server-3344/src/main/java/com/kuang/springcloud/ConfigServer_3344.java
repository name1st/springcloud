package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wonders on 2020-01-14 16:12
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer_3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer_3344.class,args);
    }
}
