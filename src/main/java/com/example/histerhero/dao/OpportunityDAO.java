package com.example.histerhero.dao;

import com.example.histerhero.model.Opportunity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OpportunityDAO extends CrudRepository<Opportunity,Long> {
    List<Opportunity> findAll();
}
