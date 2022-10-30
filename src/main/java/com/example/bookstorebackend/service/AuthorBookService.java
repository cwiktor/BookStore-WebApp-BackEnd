package com.example.bookstorebackend.service;

import com.example.bookstorebackend.model.AuthorBook;
import com.example.bookstorebackend.repository.AuthorBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorBookService {

    private final AuthorBookRepository authorBookRepository;

    public List<AuthorBook> getAllAuthorBook(){
        return authorBookRepository.findAll();
    }
}
