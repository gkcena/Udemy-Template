package com.example.udemy.repository;

import com.example.udemy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {


}
