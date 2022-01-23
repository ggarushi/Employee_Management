package com.Garushi.Employee_Managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Garushi.Employee_Managment.model.Employee;
import com.Garushi.Employee_Managment.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

//	public Optional<Employee> getEmployeeById(int id) {
//		// TODO Auto-generated method stub
//		return employeeRepository.findById(id);
//	}
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employeeExist=employeeRepository.findById(employee.getId()).orElse(null);
		if(employeeExist==null) {
			return employeeRepository.save(employee);
		}
		else {
			employeeExist.setEmail(employee.getEmail());
			employeeExist.setSalary(employee.getSalary());
			employeeExist.setName(employee.getName());
			employeeRepository.save(employee);
		}
		return employee;
		
	}

	public boolean deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Employee employeeExist =employeeRepository.getById(id);
		if(employeeExist!=null) {
			employeeRepository.deleteById(id);
			return true;
		}
			
		return false;
	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
}
