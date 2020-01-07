package com.kuang.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by wonders on 2020-01-07 15:29
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)    //链式写法
public class Dept implements Serializable {

    private Long deptno;//主键

    private String deptname;
//这个数据库存在
    private String db_source;

    public Dept(String deptname) {
        this.deptname = deptname;
    }

    /**
     * 链式写法
     * Dept dept = new Dept()
     * dept.setDept().setDeptname()
     */
}
