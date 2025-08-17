package org.ford.Assignment4;

public abstract class Vehicle {

    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    abstract void service();
}
