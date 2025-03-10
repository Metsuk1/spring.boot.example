package com.spring.SpringExample.repository.interfaces;

import com.spring.SpringExample.entity.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
