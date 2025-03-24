package com.bridgelab.universitycourse;

public class ResearchCourse extends CourseType {
    ResearchCourse(String name,String department){
        super(name,department);
    }
    @Override
    void evaluate() {
        System.out.println("ResearchCourse course is evaluate: " + getName());
        
    }
}
