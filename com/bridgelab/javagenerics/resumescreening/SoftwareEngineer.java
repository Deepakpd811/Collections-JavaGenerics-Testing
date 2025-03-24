package com.bridgelab.resumescreening;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    void evaluateResume() {
        // TODO Auto-generated method stub
        System.out.println(getCandidateName() + " resume is evaluate ");
    }
}
