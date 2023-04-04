package com.sbproject.springboot_react_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbproject.springboot_react_project.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}