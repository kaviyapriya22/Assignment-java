package org.ford.Assignment3;

public class InPatient extends Patient {

    private int roomNum;
    private String date;

    public InPatient(String id, String name,int age,int roomNum, String date) {
        super(id,name,age);
        this.roomNum = roomNum;
        this.date = date;
    }

    public String inPatientName(){
        return super.getName();
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Admission date: "+ this.date);
        System.out.println("Room number : "+this.roomNum);
    }



}
