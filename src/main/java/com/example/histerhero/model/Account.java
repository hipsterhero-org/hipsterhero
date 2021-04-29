package com.example.histerhero.model;

import javax.persistence.*;

@Entity
@Table(name="acc")
public class Account implements SObject{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountName;
    private String billingState;

    public Account() {}

    public Account(String firstName, String lastName) {
        this.accountName = firstName;
        this.billingState = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, accountName, billingState);
    }

    public Long getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getBillingState() {
        return billingState;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

}
