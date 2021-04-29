package com.example.histerhero.model;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account implements SObject{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Account() {}


    @Override
    public String toString() {
        return String.format(
                "ACcount[id=%d']",
                id);
    }

    public Long getId() {
        return id;
    }

}
