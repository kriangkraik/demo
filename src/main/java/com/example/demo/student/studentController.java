package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class studentController {
    @GetMapping
    public List<student> hello(){
        return List.of(
                new student(
                        1L ,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(1993, Month.JUNE, 25),
                        21
                )
        );
    }
}
