package org.ford.Assignment5;

import java.util.Scanner;

public class CreditcardPayment extends Payment {

    @Override
    public void processPayment(double amount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your credit card number:");
        String cardNumber=  sc.nextLine();

        if (amount>0){
            System.out.println(" Processing credit card payment for the amount"+ " "+ amount);
        }
        else{
            System.out.println(" Payment amount is not valid");
        }




    }
}
