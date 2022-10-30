package com.example.bookstorebackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private float price;
    private int numberOfPages;
    //private enum cos tam set na rodzaj okladki

    @ManyToOne
    private Purchase purchase;

    @OneToMany
    private List<AuthorBook> authorBookList;


}
