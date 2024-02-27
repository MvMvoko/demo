package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/Student")
public class StudentController {

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(1L,
                        "Mvuyisi Mvoko",
                        "Mvuyisimvoko@gmail.com",
                        LocalDate.of(2002,8, 7),
                        21 )
        );
    }

}
