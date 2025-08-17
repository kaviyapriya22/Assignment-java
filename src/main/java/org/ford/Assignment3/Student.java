package org.ford.Assignment3;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person {

    private String studentId;
    private List<Course> courses;

    public Student(String name, String email,int age, String studId){
        super(name,email,age);
        this.studentId = studId;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        courses.add(course);
        course.addStudent(this);


    }



    public void displayDetails(){
        super.displayDetails();
        System.out.println(" The courses registered by the student"+super.getName()+":  ");
        for( Course course:courses){
            System.out.println(course.getCourseName());
        }
    }


}


