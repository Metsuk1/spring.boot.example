package com.spring.SpringExample.services;

import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.repository.StudentRepository;
import com.spring.SpringExample.repository.interfaces.IStudentRepository;
import com.spring.SpringExample.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //аннотация сообщаем спрингу что это сервис
public class StudentService implements IStudentService {

    private final IStudentRepository istudentRepository;

    public StudentService(IStudentRepository istudentRepository) {
        this.istudentRepository = istudentRepository;
    }


    public List<Student> findAllStudent(){
        return List.of();
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }
}
