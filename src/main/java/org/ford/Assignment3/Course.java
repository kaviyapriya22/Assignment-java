package org.ford.Assignment3;
import java.util.ArrayList;
import java.util.List;

public class Course  {

    private String courseName;
    private Professor professorName;
    private List<Student> registeredStudent;

    public Course(String courseName, Professor professorName   ) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.registeredStudent = new ArrayList<>();
    }

    public void addStudent( Student student){
        registeredStudent.add(student);

    }

    public Professor getProfessorName() {
        return professorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayRegisteredStudents(){
        System.out.println(" Enrolled students in " +this.getCourseName());
        for (Student student : registeredStudent){
            System.out.println(student.getName());
        }
    }






}
