package com.example.bookstorebackend.service;

import com.example.bookstorebackend.model.Client;
import com.example.bookstorebackend.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
}
