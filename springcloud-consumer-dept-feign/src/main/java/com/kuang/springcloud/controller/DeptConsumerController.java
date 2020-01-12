package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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


//    @Autowired
//    private RestTemplate restTemplate;
//
//    private static String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/addDept")
    public boolean addDept(Dept dept){

        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){

        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){

        return this.service.queryAll();
    }
}
