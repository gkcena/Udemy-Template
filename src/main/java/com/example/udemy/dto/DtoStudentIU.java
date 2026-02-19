package com.example.udemy.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU { // INSERT- UPDATE İŞLEMLERİ İCİN KULLAN

    @NotEmpty(message = "firstname alanı boş olamaz")
    @Size(min = 3, max = 20 , message = "Size: 3-20")
    private String firstName;

    @NotEmpty(message = "lastname alanı boş olamaz")
    @Size(min = 3, max = 20 , message = "Size: 3-20")
    private String lastName;

    private Date birthOfDate;

}
