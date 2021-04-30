package com.example.histerhero.service;

import com.example.histerhero.dao.OpportunityDAO;
import com.example.histerhero.model.Opportunity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpportunityService {
    @Autowired
    private OpportunityDAO opportunityDAO;

}
