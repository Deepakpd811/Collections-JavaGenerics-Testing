

package com.bridgelab.universitycourse;

import java.util.ArrayList;
import java.util.List;

public class Courses<T extends CourseType> {

    private List<T> listofCouses = new ArrayList<>();

    public void addCourse(T course){
        listofCouses.add(course);
    }

    public void showCourses(){
        for(T course: listofCouses){
            System.out.println(course);
        }
    }

    public void evaluateCourses(){
        for(T course: listofCouses){
            course.evaluate();
        }
    }


    
}