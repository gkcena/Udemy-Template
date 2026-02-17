package com.example.udemy.Controller;

import com.example.udemy.Entity.Student;

import java.util.List;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudent();
}
