package com.example.bookstorebackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee extends Person{

    private String pesel;
    private float salary;

    @OneToMany
    private List<Purchase> purchasesList;


}
