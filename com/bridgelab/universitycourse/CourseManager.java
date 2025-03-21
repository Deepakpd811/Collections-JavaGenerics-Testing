package com.bridgelab.universitycourse;

import java.util.List;

public class CourseManager {
    
    public static void evaluateAllCourses(List<? extends CourseType>  courses){
        for(CourseType course: courses){
            course.evaluate();
        }
    } 

}
