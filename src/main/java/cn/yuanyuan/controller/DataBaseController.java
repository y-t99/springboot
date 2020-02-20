package cn.yuanyuan.controller;

import cn.yuanyuan.bean.Department;
import cn.yuanyuan.mapper.DepartmentMappper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuanyuan
 * #create 2020-02-21-3:16
 */
@RestController
public class DataBaseController {
    @Autowired
    DepartmentMappper departmentMappper;

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") int id){
        return departmentMappper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMappper.insertDept(department);
        return department;
    }


}
