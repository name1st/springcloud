package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.Dept;
import com.kuang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wonders on 2020-01-08 10:11
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/addDept")
    public boolean addDept(Dept dept){

        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{deptno}")
    public Dept addDept(@PathVariable("deptno") Long deptno){

        return deptService.queryById(deptno);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){

        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){

        List<String> services = client.getServices();
        System.out.println("serivces:    "+ services);

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getInstanceId()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId()+"\t"

            );
        }

        return this.client;
    }

}
