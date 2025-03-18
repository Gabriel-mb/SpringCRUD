package com.gabriel.springboot.restcrud.service;

import com.gabriel.springboot.restcrud.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
