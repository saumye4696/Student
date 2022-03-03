package com.demo.student.dao;

import com.demo.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity, String> {
}
