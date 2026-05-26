package com.example.librarymanagement.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.models.author;

@RestController
@RequestMapping("/author")
public class authorController {

    @PostMapping("/register")
    public String registerAuthor(@ModelAttribute author author) {

        System.out.println("Author ID: " + author.getAuthorid());
        System.out.println("Author Name: " + author.getAuthorname());
        System.out.println("Address: " + author.getAddress());

        return "Author Registered Successfully";
    }
}