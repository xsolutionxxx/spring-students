package com.example.student_demo;

import com.example.student_demo.Student;
import com.example.student_demo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void addStudent(@Valid Student student) {
        studentRepository.save(student);
    }

    public void updateStudent(@Valid Student student) {
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.delete(id);
    }
}
