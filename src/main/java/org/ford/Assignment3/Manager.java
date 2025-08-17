package org.ford.Assignment3;

public class Manager extends Employee {

    private int teamSize;
    private String projectName;

    public Manager(String name, String id,double salary,String department,int teamSize, String projectName) {
        super(name,id,salary,department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(" Manager team size : "+this.teamSize);
        System.out.println(" Manager project name : "+this.projectName);
    }
}
