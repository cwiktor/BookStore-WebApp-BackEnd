package com.example.bookstorebackend.service;

import com.example.bookstorebackend.model.LoyaltyCard;
import com.example.bookstorebackend.repository.LoyaltyCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoyaltyCardService {

    private final LoyaltyCardRepository loyaltyCardRepository;

    public List<LoyaltyCard> getAllLoyaltyCard(){
        return loyaltyCardRepository.findAll();
    }
}
