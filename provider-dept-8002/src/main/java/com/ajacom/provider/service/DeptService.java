package com.ajacom.provider.service;

import com.ajacom.cloud.entities.Dept;

import java.util.List;

/**
 * @author liucm
 *         Date 2019/4/23
 *         Time 14:59
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
