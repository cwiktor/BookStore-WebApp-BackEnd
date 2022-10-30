package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.model.AuthorBook;
import com.example.bookstorebackend.service.AuthorBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorBookController {

    private final AuthorBookService authorBookService;

    @GetMapping("/authorsbooks")
    public List<AuthorBook> getAllAuthorsBooks(){
        return authorBookService.getAllAuthorBook();
    }
}
