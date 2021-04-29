package com.example.histerhero.model;

import javax.persistence.*;

@Entity
public class Account implements SObject{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Account() {}


    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id);
    }

    public Long getId() {
        return id;
    }

}
