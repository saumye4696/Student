package com.demo.student.service;

import com.demo.student.dao.StudentDao;
import com.demo.student.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService")
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public String addStudent(StudentEntity student) {
        studentDao.save(student);
        return "saved";
    }

    public List<StudentEntity> getStudents() {
        return studentDao.findAll();
    }
}
