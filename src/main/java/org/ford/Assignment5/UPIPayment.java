package org.ford.Assignment5;

import java.util.Scanner;

public class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your UPI ID:");
        String upiID=  sc.nextLine();

        if (amount>0){
            System.out.println(" Processing  UPI payment for the amount"+ " "+ amount);
        }
        else{
            System.out.println(" Payment amount is not valid");
        }




    }
}
