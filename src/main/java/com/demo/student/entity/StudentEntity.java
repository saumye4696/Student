package com.demo.student.entity;

import javax.persistence.*;

@Entity
public class StudentEntity {
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
