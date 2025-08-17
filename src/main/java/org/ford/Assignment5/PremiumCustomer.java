package org.ford.Assignment5;

public class PremiumCustomer extends Customer {
    @Override
    public void calculateDiscount(double purchaseAmount) {
        double discount = (purchaseAmount * 0.20);
        System.out.println(" Discount amount for the premium customer for the amount"+ purchaseAmount+ " is "+discount);
    }


}
