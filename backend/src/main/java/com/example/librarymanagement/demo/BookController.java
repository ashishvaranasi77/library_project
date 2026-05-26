package com.example.librarymanagement.demo;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.models.book;

@RestController
@RequestMapping("/book")
public class BookController {

    @PostMapping("/Register")
    public String createBook(@ModelAttribute book book) {

        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Book Price: " + book.getPrice());
        System.out.println("Author Name: " + book.getAuthor());

        return "Book Registered Successfully";
    }
}