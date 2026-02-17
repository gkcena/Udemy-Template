package com.example.udemy.Service;

import com.example.udemy.Entity.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}
