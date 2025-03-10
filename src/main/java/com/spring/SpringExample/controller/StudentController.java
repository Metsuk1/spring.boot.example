package com.spring.SpringExample.controller;


import com.spring.SpringExample.entity.Student;
import com.spring.SpringExample.services.interfaces.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //аннотация сообщаем спрингу что это контроллер есть еще @Controller  но это ParentController
@RequestMapping("/api/v1/students")

public class StudentController {
    private final IStudentService istudentService;  //DI principle though constructor

    public StudentController(IStudentService studentService) {
        this.istudentService = studentService;
    }

    @GetMapping                         // это GET запрос
    public List<Student> findAllStudent(){
        return istudentService.findAllStudent();
    }
}
