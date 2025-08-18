package org.ford.Assignment8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StudentDriver {

    public static void main(String[] args) {

        List <Student> students = new ArrayList<>();

        Student s1 = new Student(50,"Kaviya",8.5);
        Student s2 = new Student(49,"Kavin",7.5);
        Student s3 = new Student(48,"Hemasri",8.5);
        Student s4 = new Student(33,"Harini",9.5);

        System.out.println("Adding students: ");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println("After Adding students: ");
        System.out.println(students);
        System.out.println();

        System.out.println("Removing students: ");
        students.remove(new Student(48,"",0.0));
        System.out.println(" After removing student: ");
        System.out.println(students);
        System.out.println();

        System.out.println("Updating students marks by roll number: ");
        for (Student student : students) {
            if  (student.getRollNo()==50){
                student.setMarks(9.0);
            }


        }
        System.out.println("After updating students marks by roll number: ");
        System.out.println(students);
        System.out.println();

        System.out.println("Searching student using roll number: ");
        boolean found = students.contains(new Student(50,"",0.0));
        if (found){
            System.out.println("Student with roll number 50 found");
        }
        else{
            System.out.println("Student with roll number 50 not found");
        }
        System.out.println();

        System.out.println(" Sorting based on marks:");
        System.out.println("Before Sorting:");
        System.out.println(students);
        Collections.sort(students);
        System.out.println("After Sorting:");
        System.out.println(students);
        System.out.println();

        System.out.println("Sorting student using name: ");
        System.out.println("Before Sorting:");
        System.out.println(students);
        students.sort(new StudentNameComparator());
        System.out.println("After Sorting:");
        System.out.println(students);
        System.out.println();

        System.out.println("Sorting student using roll number: ");
        System.out.println("Before Sorting:");
        System.out.println(students);
        students.sort(new StudentRollNoComparator());
        System.out.println("After Sorting:");
        System.out.println(students);
        System.out.println();




    }
}
