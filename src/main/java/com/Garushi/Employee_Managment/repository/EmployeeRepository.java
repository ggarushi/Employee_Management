package com.Garushi.Employee_Managment.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Garushi.Employee_Managment.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
//	Optional<Employee>findEmployeeById(int id);

}
