package org.ford.Assignment3;

public class Vehicle {

    private long registrationNumber;
    private String brand;
    private double rentalRate;

    public Vehicle(long registrationNumber, String brand,double rentalRate) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalRate = rentalRate;


    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void calculateRentalRate(){
        System.out.println(this.rentalRate);
    }
}
