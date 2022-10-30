package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.model.Purchase;
import com.example.bookstorebackend.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @GetMapping("/purchases")
    public List<Purchase> getAllPurchases(){
        return purchaseService.getAllPurchases();
    }

}
