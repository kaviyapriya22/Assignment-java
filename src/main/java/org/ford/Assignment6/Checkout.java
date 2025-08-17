package org.ford.Assignment6;

public class Checkout {


    public double calculateTotal(double price, int quantity) {

        if (price<=0 || quantity<=0) {
            throw new IllegalArgumentException("Invalid quantity or price");
        }
        double total = price * quantity;
        return total;




    }


}
