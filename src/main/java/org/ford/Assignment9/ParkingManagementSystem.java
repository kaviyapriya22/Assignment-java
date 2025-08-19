package org.ford.Assignment9;
import java.sql.SQLOutput;
import java.util.*;
public class ParkingManagementSystem {

    public static void main (String[] args) {

        Set <Vehicle> vehicles = new HashSet<>();
        Vehicle v1 = new Vehicle("2320","pep","scooty");
        Vehicle v2 = new Vehicle("2005","pulsor","bike");
        Vehicle v3 = new Vehicle("2004","Ford","car");

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);
        System.out.println("Vehicle hashset : ");
        System.out.println(vehicles);
        System.out.println();

        ParkingSlot p1= new ParkingSlot(1,"basement 2");
        ParkingSlot p2= new ParkingSlot(2,"basement 3");

        Map<ParkingSlot,Set<Vehicle>> parkingMap = new HashMap<>();
        parkingMap.put(p1,new HashSet<>());
        parkingMap.get(p1).add(v1);
        parkingMap.get(p1).add(v2);
        parkingMap.put(p2,new HashSet<>());
        parkingMap.get(p2).add(v1);
        parkingMap.get(p2).add(v3);
        System.out.println(parkingMap);
        System.out.println();

        System.out.println("REMOVE A VEHICLE: ");
        parkingMap.remove(p1);
        System.out.println("After removing " +parkingMap);

        System.out.println("UPDATE VEHICLE DETAILS : ");
        parkingMap.get(p2).add(v3);
        parkingMap.get(p2).add(v2);
        System.out.println("After updation: "+parkingMap);
        System.out.println();

        System.out.println("SEARCHING SLOT FOR A GIVEN VEHICLE: ");
        Vehicle v = new Vehicle("2005","pulsor","bike");
        for(Map.Entry<ParkingSlot,Set<Vehicle>> entry : parkingMap.entrySet()){
            if(entry.getValue().contains(v)){
                System.out.println(entry.getKey());
                System.out.println(v.getPlateNumber());
                System.out.println(v.getName());
            }
        }
        System.out.println();

        System.out.println("SEARCHING BIKE OR CAR:");
        for(Vehicle vehicle : vehicles){
            if (vehicle.getName().equalsIgnoreCase("Bike")||vehicle.getName().equalsIgnoreCase("Car")){
                System.out.println(vehicle);
            }

        }

        List<Vehicle> sortedVehicles = new ArrayList<>(vehicles);
        Collections.sort(sortedVehicles);
        System.out.println("Vehicles sorted by owner name: " + sortedVehicles);

        List<ParkingSlot> sortedSlots = new ArrayList<>(parkingMap.keySet());
        Collections.sort(sortedSlots, Comparator.comparingInt(ParkingSlot::getSlotid));
        System.out.println("Slots sorted by slotId: " + sortedSlots);
















    }
}
