package com.example.bookstorebackend.repository;

import com.example.bookstorebackend.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorBookRepository extends JpaRepository<AuthorBook, Long> {
}
