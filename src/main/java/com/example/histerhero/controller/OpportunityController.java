package com.example.histerhero.controller;

import com.example.histerhero.dao.OpportunityDAO;
import com.example.histerhero.dto.OpportunityDTO;
import com.example.histerhero.model.Opportunity;
import com.example.histerhero.stub.OpportunityStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@RestController
public class OpportunityController {

    @Autowired
    private OpportunityDAO opportunityDAO;
    private int limit;
    private Predicate<Opportunity> opportunityPredicate = opportunity -> {
        return opportunity.getAmount() > limit;
    };

    private Function<Opportunity, OpportunityDTO>  opportunityDTOFunction = opportunity -> {
        OpportunityDTO opportunityDTO = new OpportunityDTO();
        opportunityDTO.setId(opportunity.getId());
        opportunityDTO.setName(opportunity.getName());
        return opportunityDTO;
    };

    @GetMapping("/opportunities")
    public List<Opportunity> oppos(){
        return opportunityDAO.findAll();
    }

    @GetMapping("/filterOpportunities")
    public List<OpportunityDTO> filteredOpportunities(@RequestParam int limit){
        this.limit = limit;
        List<Opportunity> opportunities = OpportunityStub.mockOpportunities();
        List<OpportunityDTO> collect = opportunities.parallelStream().filter(opportunityPredicate).map(opportunityDTOFunction).collect(Collectors.toList());
        return collect;
    }

}
