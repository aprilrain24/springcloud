package com.ajacom.provider.service.impl;

import com.ajacom.cloud.entities.Dept;
import com.ajacom.provider.mapper.DeptMapper;
import com.ajacom.provider.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 15:03
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
