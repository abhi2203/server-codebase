package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.pojo.Employee;
import com.employee.service.EmployeeService;

@RestController
@CrossOrigin(origins={"*"})
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/smt")
	public String saveNewRegistration(@RequestBody Employee employee){
		
		String message =this.employeeService.saveEmployee(employee);
		
		return message;
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		List<Employee> empList = this.employeeService.getAllEmployee();
		return empList;
	}

}
