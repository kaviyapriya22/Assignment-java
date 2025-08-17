package org.ford;
import java.util.Scanner;
public class DataTransformer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 8-bit sensor data : ");
        int sensorData = scan.nextInt();


        String binary = Integer.toBinaryString(sensorData);
        System.out.println("Binary signal: " + binary);


        boolean motion = (sensorData & 0b00000001) != 0;
        boolean lightOn = (sensorData & 0b00000010) != 0;
        boolean doorOpen = (sensorData & 0b00000100) != 0;
        boolean windowOpen = (sensorData & 0b00001000) != 0;
        boolean smoke = (sensorData & 0b00010000) != 0;
        boolean waterLeak = (sensorData & 0b00100000) != 0;
        boolean tempHigh = (sensorData & 0b01000000) != 0;
        boolean gasLeak = (sensorData & 0b10000000) != 0;


        System.out.println("\nSensor Status:");
        System.out.println("Motion Detected: " + motion);
        System.out.println("Light ON: " + lightOn);
        System.out.println("Door Open: " + doorOpen);
        System.out.println("Window Open: " + windowOpen);
        System.out.println("Smoke Detected: " + smoke);
        System.out.println("Water Leak Detected: " + waterLeak);
        System.out.println("High Temperature: " + tempHigh);
        System.out.println("Gas Leak Detected: " + gasLeak);


    }
}
