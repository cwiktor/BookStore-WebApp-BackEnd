package com.example.bookstorebackend.service;

import com.example.bookstorebackend.model.Person;
import com.example.bookstorebackend.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public final List<Person> getAllPersons(){
        return personRepository.findAll();
    }
}
