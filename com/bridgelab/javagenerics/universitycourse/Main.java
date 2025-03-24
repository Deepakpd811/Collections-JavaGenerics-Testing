package com.bridgelab.universitycourse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Creating specific course objects
        ExamCourse examCourse1 = new ExamCourse("Mathematics", "Science");
        ExamCourse examCourse2 = new ExamCourse("Biology", "Science");
        AssignmentCourse assignmentCourse = new AssignmentCourse("Software Engineering", "Computer Science");
        ResearchCourse researchCourse = new ResearchCourse("AI Research", "Artificial Intelligence");

        // use generci to store course
        Courses<ExamCourse> examCourses = new Courses<>();
        examCourses.addCourse(examCourse1);
        examCourses.addCourse(examCourse2);

        Courses<AssignmentCourse> assignmentCourses = new Courses<>();
        assignmentCourses.addCourse(assignmentCourse);

        Courses<ResearchCourse> researchCourses = new Courses<>();
        researchCourses.addCourse(researchCourse);

        // display courses of examcourse
        examCourses.showCourses();

        // evaluate courses of examcourse
        examCourses.evaluateCourses();

        // add all courses in one list
        List<CourseType> ls = new ArrayList<>();
        ls.add(assignmentCourse);
        ls.add(examCourse1);
        ls.add(examCourse2);
        ls.add(researchCourse);
        
        System.out.println("\nEvaluating All Courses Together:");
        CourseManager.evaluateAllCourses(ls);
        

        

        


        

       

    }
}
