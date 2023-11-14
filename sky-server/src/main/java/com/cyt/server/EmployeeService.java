package com.cyt.server;


import com.cyt.dto.EmployeeLoginDTO;
import com.cyt.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}