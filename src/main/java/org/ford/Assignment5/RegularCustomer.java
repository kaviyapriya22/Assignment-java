package org.ford.Assignment5;

public class RegularCustomer extends Customer{

    @Override
    public void calculateDiscount(double purchaseAmount) {
        double discount = (purchaseAmount * 0.10);
        System.out.println(" Discount amount for the Regular customer for the amount"+ purchaseAmount+ " is "+discount);
    }
}
