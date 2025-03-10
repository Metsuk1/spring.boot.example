package com.spring.SpringExample.repository;

import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.repository.interfaces.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final List<Student> students = new ArrayList<Student>();

    public List<Student> findAllStudent(){
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }


    public Student findByEmail(String email) {
        return null;
    }

    public Student updateStudent(Student student) {
        return null;
    }

    public void deleteStudent(String email) {

    }
}
