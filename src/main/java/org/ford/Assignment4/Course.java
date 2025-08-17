package org.ford.Assignment4;

public abstract class Course {

    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void  enrollStudent(String name);

    public abstract void startCourse();
}
