package org.ford.Assignment3;
import java.util.ArrayList;
import java.util.List;
public class Order {

    List <MenuItem> items;

    public Order(){
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }
    public void calculateTotalPrice(){
        double totalPrice=0.0;
        for (MenuItem item : items){
            totalPrice+=item.getPrice();

        }
        System.out.println(" Total bill amount is : "+totalPrice);
    }

    public void displayCart(){
        for (MenuItem item : items){
            item.displayDetails();
        }
    }
}
