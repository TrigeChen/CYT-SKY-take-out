package com.cyt.server;


import com.cyt.dto.EmployeeDTO;
import com.cyt.dto.EmployeeLoginDTO;
import com.cyt.dto.EmployeePageQueryDTO;
import com.cyt.entity.Employee;
import com.cyt.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void save(EmployeeDTO employeeDTO);

    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
