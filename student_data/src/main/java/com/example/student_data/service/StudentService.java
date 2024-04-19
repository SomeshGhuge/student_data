package com.example.student_data.service;

import com.example.student_data.entity.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {
     List<Student> getAllStudents();
     Optional<Student> getStudentById(Long id);
     Student createStudent(Student student);
     void deleteStudent(Long id);
     Student updateStudent(Long id, Student student);
}