package org.example;
import java.util.*;
public class BankingCalculator {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter amount :");
         double principal= scan.nextDouble();
        System.out.println("Enter interest rate :");
         float interest= scan.nextFloat();
        System.out.println("Enter tenure :");
         int tenure= scan.nextInt();
         
         double rate= interest/12/100;
         int years = tenure*12;

         double emi= (principal*rate * Math.pow(1+rate,years ))/ (Math.pow(1+rate,years)-1) ;

         double totalAmount= emi * years;
         System.out.printf("EMI amount: %.2f%n ",emi);
        System.out.printf("Total amount: %.2f%n ",totalAmount);
        
    }
}
