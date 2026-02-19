package com.example.udemy.controller.impl;

import com.example.udemy.controller.IStudentController;
import com.example.udemy.dto.DtoStudent;
import com.example.udemy.dto.DtoStudentIU;
import com.example.udemy.entity.Student;
import com.example.udemy.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentController implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody @Valid DtoStudentIU dtoStudentIU) {
        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DtoStudent> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping(path = "/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name = "id") Long id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id") Long id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping(path = "/update/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Long id, @RequestBody DtoStudentIU updateDtoStudent) {
        return studentService.updateStudent(id, updateDtoStudent);
    }

}
