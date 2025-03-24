package com.bridgelab.universitycourse;

public class ExamCourse extends CourseType {
    ExamCourse(String name, String department){
        super(name,department);
    }

    @Override
    void evaluate() {
        System.out.println("ExamCourse course is evaluate: " + getName());
        
    }
}
