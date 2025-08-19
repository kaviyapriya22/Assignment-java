package org.ford.Assignment9;

import java.util.Objects;

public class Course implements Comparable<Course> {

    private Integer id;
    private String Name;

    public Course(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", Name=" + Name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
    @Override
    public int compareTo(Course o) {
        return this.Name.compareTo(o.Name);
    }
}
