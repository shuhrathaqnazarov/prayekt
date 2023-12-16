package com.example.lesson6_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Lesson62Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson62Application.class, args);
    }

}
