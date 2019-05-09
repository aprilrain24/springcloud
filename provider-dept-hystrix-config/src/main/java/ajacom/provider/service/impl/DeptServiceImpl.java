package ajacom.provider.service.impl;

import ajacom.provider.mapper.DeptMapper;
import ajacom.provider.service.DeptService;
import com.ajacom.cloud.entities.Dept;
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
        Dept dept = deptMapper.findById(id);
        if (null == dept) {
            throw new RuntimeException("");
        } else {
            return dept;
        }
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
