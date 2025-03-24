package com.bridgelab.universitycourse;

public class AssignmentCourse extends CourseType {
    AssignmentCourse(String name ,String department) {
        super(name,department);
    }

    @Override
    void evaluate() {
        System.out.println("AssignmentCourse course is evaluate: " + getName());
        
    }

}
