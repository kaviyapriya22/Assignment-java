package org.ford.Assignment4;

public class Burger extends MenuItem implements Deliverable {

    public Burger(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger: "+super.getItemName());
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Burger to"+tableNumber);
    }
}
