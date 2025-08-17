package org.ford.Assignment3;

import java.util.Scanner;

public class Car extends Vehicle{

    private int seatingCapacity;

    public Car(long regNum,String brand,double rentalRate,int seatingCapacity){
        super(regNum,brand,rentalRate);
        this.seatingCapacity = seatingCapacity;

    }

    public void calculateRentalRate(){
        System.out.println(" Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        double days = sc.nextInt();

        if (days>0){
            double rent = super.getRentalRate()*days;
            System.out.println(" The rental rate for car for "+days+" days is "+rent);

        }
        else{
            System.out.println("Enter valid days");
        }

    }


}
