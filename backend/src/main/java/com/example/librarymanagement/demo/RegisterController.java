package com.example.librarymanagement.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.models.Student;


@RestController
@RequestMapping("/Register")
public class RegisterController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello World Ashish</h1>";
    }
    @PostMapping("/Create")
    public String createStudent(@ModelAttribute Student student) {

        System.out.println("Full Name: " + student.getFullName());
        System.out.println("Mobile No: " + student.getMobileNo());
        System.out.println("Email ID: " + student.getEmailId());
        System.out.println("Password: " + student.getPassword());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Hobbies: " + student.getHobbies());
        System.out.println("Address: " + student.getAddress());

        return "Student Created Successfully";
    }
}
