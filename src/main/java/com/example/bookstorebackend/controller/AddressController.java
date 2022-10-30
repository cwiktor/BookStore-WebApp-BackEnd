package com.example.bookstorebackend.controller;

import com.example.bookstorebackend.model.Address;
import com.example.bookstorebackend.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping("/addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

}
