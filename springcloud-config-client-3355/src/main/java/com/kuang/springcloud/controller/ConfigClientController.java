package com.kuang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wonders on 2020-01-14 16:02
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMessage")
    public String getMessage(){

        return "applicationName:"+applicationName
        + "eurekaServer:"+eurekaServer
        + "port:"+port ;
    }

}
