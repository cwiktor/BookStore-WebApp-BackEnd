package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.model.LoyaltyCard;
import com.example.bookstorebackend.service.LoyaltyCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoyaltyCardController {

    private final LoyaltyCardService loyaltyCardService;

    @GetMapping("/loyaltycards")
    public List<LoyaltyCard> getAllLoyaltyCards(){
        return loyaltyCardService.getAllLoyaltyCard();
    }

}
