package com.example.bookstorebackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Author extends Person{

    private LocalDate dateOfBirth;

    @OneToMany
    private List<AuthorBook> authorBookList;

}
