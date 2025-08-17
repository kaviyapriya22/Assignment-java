package org.ford.Assignment3;

public class Employee {
    private String name;
    private String id;
    private double salary;
    private String department;

    public Employee(String name, String id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.println(" Employee name : "+getName());
        System.out.println(" Employee id : "+getId());
        System.out.println(" Employee salary : "+getSalary());
        System.out.println(" Employee department : "+getDepartment());
    }
}
