package com.spring.SpringExample.controller;


import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.services.StudentService;
import com.spring.SpringExample.services.interfaces.IStudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //аннотация сообщаем спрингу что это контроллер есть еще @Controller  но это ParentController
@RequestMapping("/api/v1/students")

public class StudentController {
    private final StudentService studentService;  //DI principle though constructor

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping                         // это GET запрос
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @PostMapping("save_students")
    public String saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Student saved successfully";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email){
        return studentService.findByEmail(email);
    }

    @PutMapping("update_students")
    public Student updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(String email){
        studentService.deleteStudent(email);
    }
}
