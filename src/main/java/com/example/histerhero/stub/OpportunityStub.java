package com.example.histerhero.stub;

import com.example.histerhero.model.Opportunity;

import java.util.ArrayList;
import java.util.List;

public class OpportunityStub {

    public static List<Opportunity> mockOpportunities(){
        List<Opportunity> list = new ArrayList<>();
        for(int i = 1 ; i <= 1000 ; i++){
            Opportunity opportunity = new Opportunity();
            opportunity.setId(String.valueOf(i));
            opportunity.setName(String.valueOf(i));
            opportunity.setAmount(Double.valueOf(i));
            opportunity.setRelated(String.valueOf(i));
            list.add(opportunity);
        }
        return list;
    }

}
