package org.ford.Assignment9;

import java.util.*;
import java.util.stream.Collectors;

public class StudentCourseEnrollmentDriver {

    public static void main(String[] args) {

        Course c1 = new Course(21,"Java");
        Course c2 = new Course(24,"Springboot");
        Course c3 = new Course(22,"Google cloud");
        Course c4 = new Course(23,"Database");

        Set<Course> courseSet = new HashSet<>();
        courseSet.add(c1);
        courseSet.add(c2);
        courseSet.add(c3);
        courseSet.add(c4);
        System.out.println(courseSet);

        Map<Student, Set<Course>> studentRegistryMap= new HashMap<>();
        Student s1 = new Student(50,"Kaviya");
        Student s2 = new Student(60,"Priya");
        Student s3 = new Student(56,"Merudhula");


        studentRegistryMap.put(s1,new HashSet<>() );
        studentRegistryMap.get(s1).add(new Course(21,"Java"));
        studentRegistryMap.get(s1).add(new Course(24,"Springboot"));
        studentRegistryMap.get(s1).add(new Course(22,"Google cloud"));
        studentRegistryMap.put(s3,new HashSet<>() );
        studentRegistryMap.get(s3).add(new Course(23,"Database"));
        studentRegistryMap.get(s3).add(new Course(22,"Google cloud"));
        studentRegistryMap.get(s3).add(new Course(21,"Java"));
        studentRegistryMap.put(s2,new HashSet<>());
        studentRegistryMap.get(s2).add(new Course(24,"Sprringboot"));


        System.out.println(studentRegistryMap);

        System.out.println();
        System.out.println("Before adding new courses:"+courseSet);
        System.out.println("Adding new course: ");
        courseSet.add(new Course(30,"Psychology"));
        System.out.println("After adding new course: "+ courseSet);
        System.out.println();

        System.out.println("UPDATING A STUDENT REGISTRATION BY ADDING A NEW COURSE: ");
        studentRegistryMap.get(s3).add(new Course(30,"Psychology"));
        studentRegistryMap.get(s3).add(new Course(23,"Database"));
        System.out.println("After adding new course: "+ studentRegistryMap.get(s3));
        System.out.println(studentRegistryMap);
        System.out.println();

        System.out.println("REMOVING A STUDENT FROM THE MAP :");
        studentRegistryMap.remove(s2);
        System.out.println( studentRegistryMap);
        System.out.println();

        System.out.println("SEARCHING ALL COURSES TAKEN BY A STUDENT");
        System.out.println(studentRegistryMap.get(s1));
        System.out.println(studentRegistryMap.get(s3));

        System.out.println("SEARCHING STUDENTS REGISTERED FOR Google cloud: ");
        Course c = new Course(22,"Google cloud");
        for (Map.Entry<Student, Set<Course>> entry : studentRegistryMap.entrySet()) {
            if (entry.getValue().contains(c)) {
                System.out.println(entry.getKey().getName());
            }

        }
        System.out.println();

        System.out.println("SORTING COURSES BASED ON COURSENAME");
        List<Course> courselist = new ArrayList<>(courseSet);
        Collections.sort(courselist);
        System.out.println(courselist);
        System.out.println();

        System.out.println("SORTING STUDENTS BASED ON NAME ");
        List<Student> studentlist = new ArrayList<>(studentRegistryMap.keySet());
        Collections.sort(studentlist);
        System.out.println(studentlist);









    }
}
