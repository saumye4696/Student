package com.demo.student.controller;

import com.demo.student.entity.StudentEntity;
import com.demo.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentApi {
    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestBody StudentEntity student) {
        studentService.addStudent(student);
        return "saved";
    }

    @GetMapping(value = "/getAll")
    public List<StudentEntity> getStudents() {
        return studentService.getStudents();
    }
}
