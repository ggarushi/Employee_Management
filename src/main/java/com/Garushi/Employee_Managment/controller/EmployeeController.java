package com.Garushi.Employee_Managment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.Garushi.Employee_Managment.model.Employee;
import com.Garushi.Employee_Managment.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	//add employee database
	@PostMapping("/addEmployees")
	public Employee addEmployees(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	//get employee information
	@GetMapping("/getEmployeeById/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	//update employee
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/deleteEmployeeById/{id}")
	public boolean deleteEmployeeById(@PathVariable int id) {
		return employeeService.deleteEmployeeById(id);
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
}
