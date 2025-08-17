package org.ford.Assignment5;

public class Customer {


    public void calculateDiscount(double purchaseAmount){
        double discount = purchaseAmount * 0.05;
        System.out.println(" Discount amount for the generic customer for the amount"+ purchaseAmount+ " is "+discount);

    };

    public void calculateDiscount(double purchaseAmount,int loyaltyPoint){
        double discount = (purchaseAmount * 0.05)+(loyaltyPoint*0.1);
        System.out.println(" Discount amount for the generic customer with loyalty points for the amount"+ purchaseAmount+ " is "+discount);

    };


}
