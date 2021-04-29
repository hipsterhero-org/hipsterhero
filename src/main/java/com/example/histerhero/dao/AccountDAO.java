package com.example.histerhero.dao;

import com.example.histerhero.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountDAO extends CrudRepository<Account,Long> {
    List<Account> findAll();
}
