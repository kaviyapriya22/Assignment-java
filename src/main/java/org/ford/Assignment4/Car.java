package org.ford.Assignment4;

public class Car extends Vehicle implements Repairable{

    public Car(String brand, String model) {
        super(brand, model);
    }

    public void service(){
        System.out.println("Servicing car : "+ " "+super.getBrand());
    }
    @Override
    public void repair(){
        System.out.println("Repairing car engine");
    }
}
