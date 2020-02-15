package cn.yuanyuan.controller;

import cn.yuanyuan.dao.DepartmentDao;
import cn.yuanyuan.dao.EmployeeDao;
import cn.yuanyuan.entities.Department;
import cn.yuanyuan.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yuanyuan
 * #create 2020-02-14-22:41
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model){
        final Collection<Employee> employees = employeeDao.getAll();

        model.addAttribute("emps",employees);

        return "emp/list";
    }
    @GetMapping("/emp")
    public String toAddPage(Model model){
        final Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }
    @PostMapping("/emp")
    public String add(Employee employee,BindingResult bindingResult){
        employee.setBirth(new Date());
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id")Integer id,Model model){
        Employee employee= employeeDao.get(id);
        model.addAttribute("emp",employee);
        final Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String add(@PathVariable("id")String id){
        employeeDao.delete(Integer.valueOf(id));
        return "redirect:/emps";
    }
}
