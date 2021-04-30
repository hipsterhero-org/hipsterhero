package com.example.histerhero.controller;

import com.example.histerhero.dao.ContactDAO;
import com.example.histerhero.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    private ContactDAO contactDAO;

    @GetMapping("/contacts")
    public List<Contact> getContacts(){
        return contactDAO.findAll();
    }

}
