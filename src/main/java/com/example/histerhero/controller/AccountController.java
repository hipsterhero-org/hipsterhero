package com.example.histerhero.controller;

import com.example.histerhero.dao.AccountDAO;
import com.example.histerhero.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountDAO accountDAO;

    @GetMapping("/accounts")
    public List<Account> accounts(){
        return accountDAO.findAll();
    }

    @GetMapping("/createDummyData")
    public String createDummy(){
        for(int i =0 ; i < 10000 ; i ++){
            Account a = new Account();
            a.setAccountName(String.valueOf(i));
            if (i % 2 == 0) {
                a.setBillingState("RM");
            } else {
                a.setBillingState("MI");
            }
            accountDAO.save(a);
        }
        return "I did create a lot of dummy records!";
    }
}
