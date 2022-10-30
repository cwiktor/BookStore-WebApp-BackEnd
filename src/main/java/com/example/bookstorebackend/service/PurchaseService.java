package com.example.bookstorebackend.service;

import com.example.bookstorebackend.model.Purchase;
import com.example.bookstorebackend.repository.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public List<Purchase> getAllPurchases(){
        return purchaseRepository.findAll();
    }
}
