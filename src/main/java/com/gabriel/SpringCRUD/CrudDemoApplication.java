package com.gabriel.SpringCRUD;

import com.gabriel.SpringCRUD.dao.StudentDAO;
import com.gabriel.SpringCRUD.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

        return runner -> {
            //createStudent(studentDAO);
            //readStudent(studentDAO);
            //queryForStudents(studentDAO);
            //updateStudent(studentDAO);
            //deleteStudent(studentDAO);
        };
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 2;
        System.out.println("Deleting student Id: " + studentId);
        studentDAO.delete(studentId);
    }

    private void updateStudent(StudentDAO studentDAO) {

        int studentId = 1;
        System.out.println("Getting student with id: " + studentId);
        Student student = studentDAO.findById(studentId);

        System.out.println("Updating student...");
        student.setFirstName("Paul");

        studentDAO.update(student);

        System.out.println("Updated student: " + student);

    }

    private void queryForStudents(StudentDAO studentDAO) {

        List<Student> students = studentDAO.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {

        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Gabriel", "Menezes", "gabrielmenezes@gmail.com");

        System.out.println("Saving student...");
        studentDAO.save(tempStudent);

        int theId = tempStudent.getId();
        System.out.println("Saved student. Generated id: " + theId);

        System.out.println("Retrieving student with id: " + theId);
        Student student = studentDAO.findById(theId);

        System.out.println("Found the student: " + student);
    }

    private void createStudent(StudentDAO studentDAO) {

        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Paul", "Grande", "PaulGrande@gmail.com");

        System.out.println("Saving student...");
        studentDAO.save(tempStudent);

        System.out.println("Saved student. Generated id: " + tempStudent.getId());
    }
}
