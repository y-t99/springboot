package cn.yuanyuan.mapper;

import cn.yuanyuan.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author yuanyuan
 * #create 2020-02-21-3:10
 */
//@Mapper
public interface DepartmentMappper {
    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);
    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    int insertDept(Department department);
    @Update("update department set department_name=#{departmentName} where id=#{id}")
    int updateDept(Department department);
}
