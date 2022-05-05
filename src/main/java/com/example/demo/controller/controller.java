package com.example.demo.controller;


import com.example.demo.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@RestController
@RequestMapping("/demo")
public class controller {
    ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();

    @GetMapping("/{id}")
    public Contact getContact (@PathVariable String id) {
        return contacts.get(id);
    }

    @PostMapping("/")
    public Contact addContact (@RequestBody Contact contact){
        contacts.put(contact.getId(), contact);
        return contact;
    }

}
