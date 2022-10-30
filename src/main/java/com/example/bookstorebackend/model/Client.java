package com.example.bookstorebackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Client extends Person{

    private String phoneNumber;

    @OneToOne
    private Address address;

    @OneToOne
    private LoyaltyCard loyaltyCard;

    @OneToMany
    private List<Purchase> purchasesList;
}
