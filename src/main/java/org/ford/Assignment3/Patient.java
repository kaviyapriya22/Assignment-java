package org.ford.Assignment3;



public class Patient {

    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void displayDetails(){

        System.out.println("Name: "+this.name);
        System.out.println("Patient Id: "+this.patientId);
        System.out.println("Age: "+this.age);
    }






}

