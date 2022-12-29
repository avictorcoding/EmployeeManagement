package com.accenture.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.EmployeeManagement.entity.Employee;
import com.accenture.EmployeeManagement.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//get all employees
	@GetMapping("/getAllEmployees")
	List<Employee> getEmployees() {
		
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}

}
