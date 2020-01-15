package com.kuang.springcloud.service;

import com.kuang.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wonders on 2020-01-12 12:15
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {


    @Override
    public DeptClientService create(Throwable throwable) {

        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDeptname("id=>"+id+"没有对应的信息，客户端提供了降级，服务可能被关闭了！")
                        .setDb_source("没有数据了。。。");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
