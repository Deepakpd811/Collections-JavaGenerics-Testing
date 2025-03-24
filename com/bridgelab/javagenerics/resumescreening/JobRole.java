package com.bridgelab.resumescreening;

// abstract class Job role
abstract class JobRole {
    private String candidateName;
    private int experienceYears;

    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    abstract void evaluateResume();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: " + candidateName + " expericence year: " + experienceYears;
    }

}
