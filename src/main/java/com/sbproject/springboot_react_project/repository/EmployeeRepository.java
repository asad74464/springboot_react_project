package com.sbproject.springboot_react_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sbproject.springboot_react_project.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}