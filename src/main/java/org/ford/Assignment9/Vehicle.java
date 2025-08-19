package org.ford.Assignment9;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle> {

    private String plateNumber;
    private String  name;
    private String type;

    public Vehicle(String plateNumber, String name, String type) {
        this.plateNumber = plateNumber;
        this.name = name;
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(plateNumber, vehicle.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plateNumber);
    }

    @Override
    public int compareTo(Vehicle o) {
        return name.compareTo(o.name);
    }

}
