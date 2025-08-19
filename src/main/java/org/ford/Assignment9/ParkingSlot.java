package org.ford.Assignment9;

import java.util.Objects;

public class ParkingSlot implements Comparable<ParkingSlot> {


    private Integer slotid;
    private String location;

    public ParkingSlot(Integer slotid, String location) {
        this.slotid = slotid;
        this.location = location;
    }

    public Integer getSlotid() {
        return slotid;
    }

    public void setSlotid(Integer slotid) {
        this.slotid = slotid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotid=" + slotid +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSlot that = (ParkingSlot) o;
        return Objects.equals(slotid, that.slotid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(slotid);
    }
    public int compareTo(ParkingSlot o) {
        return slotid.compareTo(o.slotid);
    }
}
