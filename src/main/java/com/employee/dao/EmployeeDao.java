package com.employee.dao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.employee.pojo.Employee;


@Repository
public class EmployeeDao {

//	@Autowired
//	public EmployeeRepo employeeRepo;
	
	List<Employee> ll = new LinkedList<Employee>();
	
	public String saveEmployeeRecord(Employee emp){
		String message = "";
		boolean bool = ll.add(emp);
		System.out.println(ll.size());
		if(bool){
			message = "Success";
		}else{
			message = "Fail";
		}
		return message;
	}
	
	public List<Employee> getAllEmployee(){
		return ll;
	}
}
