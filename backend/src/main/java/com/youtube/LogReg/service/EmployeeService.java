package com.youtube.LogReg.service;

import com.youtube.LogReg.DTO.EmployeeDTO;
import com.youtube.LogReg.DTO.LoginDTO;
import com.youtube.LogReg.response.LoginMesage;

public interface EmployeeService {
	
    String addEmployee(EmployeeDTO employeeDTO);
    LoginMesage loginEmployee(LoginDTO loginDTO);

}
