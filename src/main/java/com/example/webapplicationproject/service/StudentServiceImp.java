package com.example.webapplicationproject.service;

import com.example.webapplicationproject.model.Student;
import com.example.webapplicationproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();

    }
}
