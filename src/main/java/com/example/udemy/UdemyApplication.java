package com.example.udemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan(basePackages = {"com.example.udemy"})
public class UdemyApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyApplication.class, args);
    }

}
