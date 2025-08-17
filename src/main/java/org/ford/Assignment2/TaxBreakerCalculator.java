package org.ford.Assignment2;

import java.util.Scanner;

public class TaxBreakerCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfEmployees = Integer.parseInt(scan.nextLine());

        double[] employeeIncomes = new double[numberOfEmployees];
        double taxPercent = 0.0;

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println(" Enter your annual income: ");
            double employeeincome = Double.parseDouble(scan.nextLine());

            if (employeeincome > 0) {
                employeeIncomes[i] = employeeincome;
            } else {
                System.out.println("Invalid income");
                i--;
            }
        }

        for (double employeeIncome : employeeIncomes) {

            double taxAmount = 0;


            if (employeeIncome <= 250000.0) {
                taxPercent = 0;
            } else if (250000.0 < employeeIncome && employeeIncome <= 500000.0) {
                taxPercent = 5;
            } else if (500000.0 < employeeIncome && employeeIncome <= 1000000.0) {
                taxPercent = 20;
            } else if (100000.0 < employeeIncome) {
                taxPercent = 30;
            }

            taxAmount = (taxPercent / 100) * employeeIncome;

            System.out.println(" Employee income: " + employeeIncome);
            System.out.println(" Tax percent : " + taxPercent);
            System.out.println(" Tax amount : " + taxAmount);
        }
    }
}
