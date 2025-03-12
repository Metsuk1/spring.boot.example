package com.spring.SpringExample.repository;

import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.repository.interfaces.IStudentRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class StudentRepository implements IStudentRepository {
    private final List<Student> students = new ArrayList<Student>();

    @Override
    public List<Student> findAllStudent(){
        return students;
    }

    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
        return students.stream().filter(student -> student.getEmail().equals(email))
                .findFirst().orElse(null);
    }

    @Override
    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, students.size())
                .filter(index  -> students.get(index).getEmail().equals(student.getEmail()))
                .findFirst().orElse(-1);
        if (studentIndex > -1) {
            students.set(studentIndex, student);

            return student;
        }
        return null;
    }

    @Override
    public void deleteStudent(String email) {
        var student  = findByEmail(email);
        if (student != null) {
            students.remove(student);
        }
    }
}
