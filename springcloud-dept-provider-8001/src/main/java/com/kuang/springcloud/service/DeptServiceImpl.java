package com.kuang.springcloud.service;

import com.kuang.springcloud.dao.DeptDao;
import com.kuang.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wonders on 2020-01-08 09:58
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long deptno) {

        return deptDao.queryById(deptno);
    }

    @Override
    public List<Dept> queryAll() {

        return deptDao.queryAll();
    }
}
