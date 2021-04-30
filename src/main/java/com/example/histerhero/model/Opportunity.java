package com.example.histerhero.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Opportunity {

    @Id
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="amount")
    private Double amount;
    @Column(name="relatedAccount")
    private String related;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }
}
