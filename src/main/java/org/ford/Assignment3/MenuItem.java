package org.ford.Assignment3;

public class MenuItem {

    private String name;
    private double price;
    private String type;

    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }




}
