package com.example.udemy.service.impl;

import com.example.udemy.dto.DtoStudent;
import com.example.udemy.dto.DtoStudentIU;
import com.example.udemy.entity.Student;
import com.example.udemy.repository.StudentRepository;
import com.example.udemy.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);
        Student dbStudent = studentRepository.save((student));
        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }

    @Override
    public List<DtoStudent> getAllStudent() {
        List<DtoStudent> dtoStudentList = new ArrayList<>();
        List<Student> studentList = studentRepository.findAll();

        for (Student student : studentList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            dtoStudentList.add(dtoStudent);
        }
        return dtoStudentList;
    }

    @Override
    public DtoStudent getStudentById(Long id) {
        DtoStudent dto = new DtoStudent();
        Optional<Student> studentById = studentRepository.findById(id);
        if (studentById.isPresent()) {
            Student dbstudent = studentById.get();
            BeanUtils.copyProperties(dbstudent, dto);
        }
        return dto;
    }

    @Override
    public void deleteStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            studentRepository.delete(optionalStudent.get());
        }
    }

    @Override
    public DtoStudent updateStudent(Long id, DtoStudentIU updatedDtoStudentIU) {
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()) {
            //set part
            Student dbStudent = optionalStudent.get();
            dbStudent.setFirstName(updatedDtoStudentIU.getFirstName());
            dbStudent.setLastName(updatedDtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(updatedDtoStudentIU.getBirthOfDate());
            // get part
            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent, dtoStudent);
            return dtoStudent;
        }
        return null;


    }
}



