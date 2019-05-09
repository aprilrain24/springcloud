package ajacom.provider.controller;

import ajacom.provider.common.ApiResult;
import ajacom.provider.service.DeptService;
import com.ajacom.cloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public ApiResult<Object> get(@PathVariable("id") Long id) throws Throwable {
        return ApiResult.builder().data(deptService.get(id)).build();

    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }
}
