package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by wonders on 2020-01-08 12:40
 */
@RestController
public class DeptConsumerController {

    //理解 消费者，不因该有service
    // ResultFul
    // (url , 实体：map Class<T> responseType)


    @Autowired
    private RestTemplate restTemplate;

    private static String REST_URL_PREFIX = "http://localhost:8001";



    @RequestMapping("/consumer/dept/addDept")
    public boolean addDept(Dept dept){

        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/addDept",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }
}
