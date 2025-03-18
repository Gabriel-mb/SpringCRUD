package com.gabriel.springboot.restcrud.dao;

import com.gabriel.springboot.restcrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
