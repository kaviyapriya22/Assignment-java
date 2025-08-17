package org.ford.Assignment4;

public class Pizza extends MenuItem implements Deliverable{

    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza: "+super.getItemName());
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering Pizza to"+tableNumber);
    }
}
