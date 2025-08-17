package org.ford.Assignment3;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {

    private String empId;
    private List<Course> coursesTaught;

    public Professor(String name,String email,int age,String empId) {
        super(name,email,age);
        this.empId = empId;
        this.coursesTaught = new ArrayList<>();


    }

    public void addCourse(Course course){
        coursesTaught.add(course);
    }

    public void courseTaken (){
        System.out.println(" The course taken by "+ this.getName()+":");
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }

    public void displayCoursesTaught(){
        for (Course course : coursesTaught) {
            System.out.println(course.getCourseName());
        }
    }




}
