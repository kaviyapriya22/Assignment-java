package org.ford.Assignment2;
import java.util.Scanner;
import java.util.Arrays;
public class TollBoothBilling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vehicleCount = input.nextInt();
        input.nextLine();
        String[] vehicles = new String[vehicleCount];
        String[] vehiclesList = {"car", "truck", "bike", "bus"};

        int carFare = 100;
        int truckFare = 250;
        int bikeFare = 50;
        int busFare = 200;
        int totalAmount = 0;

        int carCount = 0;
        int truckCount = 0;
        int bikeCount = 0;
        int busCount = 0;

        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(" Enter your vehicle type: ");
            String vehicleType = input.nextLine();
            if (Arrays.asList(vehiclesList).contains(vehicleType)) {

                vehicles[i] = vehicleType;}
            else{
                System.out.println("Invalid vehicle type");
                i--;
                continue;
            }}

            for (String vehicle : vehicles) {
                    switch (vehicle) {
                        case "car":
                            totalAmount += carFare;
                            carCount++;
                            break;

                        case "truck":
                            totalAmount += truckFare;
                            truckCount++;
                            break;
                        case "bike":
                            totalAmount += bikeFare;
                            bikeCount++;
                            break;
                        case "bus":
                            totalAmount += busFare;
                            busCount++;
                            break;
                        default:
                            System.out.println("Invalid vehicle type");
                    }
                }

            System.out.println("Total truck passed: " + truckCount);
            System.out.println("Total bike passed: " + bikeCount);
            System.out.println("Total bus passed: " + busCount);
            System.out.println("Total car passed: " + carCount);
            System.out.println("Total toll collection amount: " + totalAmount);
    }
}
