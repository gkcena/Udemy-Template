package com.example.udemy.Service.impl;

import com.example.udemy.Entity.Student;
import com.example.udemy.Repository.StudentRepository;
import com.example.udemy.Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save((student));
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }


}
