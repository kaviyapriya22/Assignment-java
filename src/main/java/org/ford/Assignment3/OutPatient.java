package org.ford.Assignment3;

public class OutPatient extends Patient {

    private String visitDate;
    private double consultationFee;

    public OutPatient(String id,String name,int age,String visitDate,double consultationFee) {
        super(id,name,age);
        this.visitDate = visitDate;
        this.consultationFee = consultationFee;

    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Visiting date: "+ this.visitDate);
        System.out.println("Consultation Fee: "+ this.consultationFee);
    }


}
