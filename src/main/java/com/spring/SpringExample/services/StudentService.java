package com.spring.SpringExample.services;

import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.repository.StudentRepository;
import com.spring.SpringExample.repository.interfaces.IStudentRepository;
import com.spring.SpringExample.services.interfaces.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //аннотация сообщаем спрингу что это сервис
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudent(){
        return studentRepository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteStudent(email);
    }
}
