package com.ajacom.provider.controller;

import com.ajacom.cloud.entities.Dept;
import com.ajacom.provider.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:00
 */
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "empty")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (null == dept) {
            throw new RuntimeException("\"该ID：\" + id + \"没有没有对应的信息\"");
        }
        return dept;
    }

    public Dept empty(@PathVariable("id") Long id) {
        return new Dept().setDeptNo(id).setDeptName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDbSource("no this database in MySQL");
    }
}
