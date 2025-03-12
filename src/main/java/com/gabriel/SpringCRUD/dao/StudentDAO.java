package com.gabriel.SpringCRUD.dao;

import com.gabriel.SpringCRUD.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    void update(Student student);

    void delete(Integer id);
}
