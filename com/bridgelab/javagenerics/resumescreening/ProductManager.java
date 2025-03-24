package com.bridgelab.resumescreening;

public class ProductManager extends JobRole {
    // constructor
    public ProductManager(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    void evaluateResume() {
        
        System.out.println(getCandidateName() + " resume is evaluate ");
    }
}
