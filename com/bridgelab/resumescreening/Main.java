package com.bridgelab.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create candidates
        SoftwareEngineer seCandidate = new SoftwareEngineer("Deepak", 5);
        SoftwareEngineer seCandidate2 = new SoftwareEngineer("raj", 5);
        DataScientist dsCandidate = new DataScientist("Ritick gupta", 3);
        ProductManager pmCandidate = new ProductManager("Rohit", 7);

        // creation of resume of software engineer
        Resume<SoftwareEngineer> seResume = new Resume<>();
        seResume.addResume(seCandidate);
        seResume.addResume(seCandidate2);
        seResume.processResume(); // evaluate manually

        Resume<DataScientist> dsResume = new Resume<>();
        dsResume.addResume(dsCandidate);

        Resume<ProductManager> pmResume = new Resume<>();
        pmResume.addResume(pmCandidate);

        // Using wildcard method to process multiple job roles dynamically
        List<JobRole> allCandidates = new ArrayList<>();
        allCandidates.add(seCandidate);
        allCandidates.add(dsCandidate);
        allCandidates.add(pmCandidate);

        System.out.println("\n---------Displaying all candidates");
        ResumeScreening.screenCandidates(allCandidates);

    }
}
