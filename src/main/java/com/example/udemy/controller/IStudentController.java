package com.example.udemy.controller;

import com.example.udemy.dto.DtoStudent;
import com.example.udemy.dto.DtoStudentIU;
import com.example.udemy.entity.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudent();

    public DtoStudent getStudentById(Long id);

    public void deleteStudentById(Long id);

    public DtoStudent updateStudent(Long id, DtoStudentIU updateDtoStudent);
}
