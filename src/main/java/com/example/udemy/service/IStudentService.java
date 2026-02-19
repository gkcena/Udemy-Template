package com.example.udemy.service;

import com.example.udemy.dto.DtoStudent;
import com.example.udemy.dto.DtoStudentIU;

import java.util.List;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudent();

    public DtoStudent getStudentById(Long id);

    public void deleteStudentById(Long id);

    public DtoStudent updateStudent(Long id, DtoStudentIU updatedDtoStudentIU);
}
