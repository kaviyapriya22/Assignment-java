package org.ford.Assignment3;

public class NonVegItem extends MenuItem{

    private int calories;
    private String spice_level;

    public NonVegItem(String name, double price, String type,int calories,String spice_level) {
        super(name,price,type);
        this.calories = calories;
        this.spice_level = spice_level;

    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Calories: " + calories);
        System.out.println("Spice level: " + spice_level);
    }
}
