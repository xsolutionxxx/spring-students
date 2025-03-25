package com.example.student_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private List<Student> students = new ArrayList<>();
    private Long currentId = 1L;

    // Створення деяких тестових даних
    public StudentRepository() {
        students.add(new Student(currentId++, "John Doe", 20));
        students.add(new Student(currentId++, "Jane Smith", 22));
        students.add(new Student(currentId++, "Mike Johnson", 19));
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findById(Long id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst();
    }

    public void save(Student student) {
        if (student.getId() == null) {
            student.setId(currentId++);
            students.add(student);
        } else {
            students.replaceAll(s -> s.getId().equals(student.getId()) ? student : s);
        }
    }

    public void delete(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}