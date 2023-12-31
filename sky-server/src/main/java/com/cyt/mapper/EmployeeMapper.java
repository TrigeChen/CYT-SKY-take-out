package com.cyt.mapper;


import com.cyt.annotation.AutoFill;
import com.cyt.dto.EmployeePageQueryDTO;
import com.cyt.entity.Employee;
import com.cyt.enumeration.OperationType;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

    /**
     *
     * @param employee
     */
    @Insert("insert into employee" +
            "(name, username, password, phone, sex, id_number, create_time, update_time, create_user, update_user)" +
            "values" +
            "(#{name},#{username}, #{password}, #{phone}, #{sex}, #{idNumber}, " +
            "#{createTime}, #{updateTime}, #{createUser}, #{updateUser})")
    @AutoFill(value = OperationType.INSERT)
    void insert(Employee employee);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    Page<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 根据主键动态修改属性
     */
    @AutoFill(value = OperationType.UPDATE)
    void updata(Employee employee);

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    @Select("select * from employee where id = #{id}")
    Employee getById(Long id);
}
