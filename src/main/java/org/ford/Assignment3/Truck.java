package org.ford.Assignment3;

import java.util.Scanner;

public class Truck extends Vehicle {

    private int loadCapacity;

    public Truck(long regNum,String brand,double rentalRate,int loadCapacity) {
        super(regNum,brand,rentalRate);
        this.loadCapacity = loadCapacity;
    }

    public void calculateRentalRate(){
        System.out.println(" Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        double days = sc.nextInt();

        if (days>0){
            double rent = super.getRentalRate()*days;
            System.out.println(" The rental rate for truck for "+days+" days is "+rent);

        }
        else{
            System.out.println("Enter valid days");
        }

    }
}
