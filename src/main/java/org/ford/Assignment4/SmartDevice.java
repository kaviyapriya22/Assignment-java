package org.ford.Assignment4;

public  abstract class SmartDevice {

    String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void turnOn();
}
