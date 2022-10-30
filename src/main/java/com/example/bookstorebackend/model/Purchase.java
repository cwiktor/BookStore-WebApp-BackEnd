package com.example.bookstorebackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dateOfPurchase;
    private float discount;
    private float valueOfPurchase;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Employee employee;

    @OneToMany
    private List<Book> booksList;
}
