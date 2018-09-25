package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.pojo.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public String saveEmployee(Employee empl){
		String message = employeeDao.saveEmployeeRecord(empl);
		return message;
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee> listEmp = employeeDao.getAllEmployee();
		return listEmp;
	}
}
