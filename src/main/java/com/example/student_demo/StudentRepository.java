package com.example.student_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    // Створимо деякі тестові дані
    public StudentRepository() {
        students.add(new Student(1L, "John Doe", 20));
        students.add(new Student(2L, "Jane Smith", 22));
        students.add(new Student(3L, "Mike Johnson", 19));
    }

    public List<Student> findAll() {
        return students;
    }
}
