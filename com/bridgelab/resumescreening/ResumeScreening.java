package com.bridgelab.resumescreening;

import java.util.List;

public class ResumeScreening {
    
    public static void screenCandidates(List<? extends JobRole> allCandidates){
        for(JobRole candidate : allCandidates){
            candidate.evaluateResume();
        }
    }

}
