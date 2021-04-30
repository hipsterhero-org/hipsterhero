package com.example.histerhero.dao;

import com.example.histerhero.model.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactDAO extends CrudRepository<Contact,Long> {

    List<Contact> findAll();

}
