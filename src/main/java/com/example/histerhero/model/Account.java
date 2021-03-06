package com.example.histerhero.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Account implements SObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private boolean isDeleted;
    private String name;
    private Date systemModsStam;

    public Account() {}

    @Override
    public String toString() {
        return String.format(
                "ACcount[id=%d']",
                id);
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSystemModsStam() {
        return systemModsStam;
    }

    public void setSystemModsStam(Date systemModsStam) {
        this.systemModsStam = systemModsStam;
    }

}
