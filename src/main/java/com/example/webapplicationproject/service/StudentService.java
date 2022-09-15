package com.example.webapplicationproject.service;

import com.example.webapplicationproject.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
