package org.ford.Assignment3;

import java.util.Scanner;

public class Bike extends Vehicle {

    int engineCapacity;


    public Bike(long regNum,String brand,double rentalRate, int engineCapacity){
        super(regNum,brand,rentalRate);
        this.engineCapacity = engineCapacity;
    }


    public void calculateRentalRate(){
        System.out.println(" Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        double days = sc.nextInt();

        if (days>0){
            double rent = super.getRentalRate()*days;
            System.out.println(" The rental rate for bike for "+days+" days is "+rent);

        }
        else{
            System.out.println("Enter valid days");
        }


    }
}
