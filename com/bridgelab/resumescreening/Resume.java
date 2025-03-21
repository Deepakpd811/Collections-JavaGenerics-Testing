package com.bridgelab.resumescreening;

import java.util.ArrayList;
import java.util.List;

public class Resume<T extends JobRole> {
    
    List<T> listOfResume = new ArrayList<>();

    public void addResume(T resume){
        listOfResume.add(resume);
    }

    public void processResume(){
        for(T resume: listOfResume){
            resume.evaluateResume();
        }
    }

}
