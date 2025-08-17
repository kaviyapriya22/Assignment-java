package org.ford.Assignment1;
import java.util.Scanner;


public class TaxCalculator {

    public static void main(String [] args){

        Scanner scan = new Scanner ( System.in);

        float monthlySalary = Float.parseFloat(scan.nextLine());

        float annualSalary= monthlySalary*12;
        float taxPercentage=0;

        if (annualSalary<=400000.0){
            taxPercentage=0;

        }
        else if (annualSalary>400000 && annualSalary <= 800000) {

            taxPercentage= 5;

        }
        else if (annualSalary>800000 && annualSalary <= 1200000) {
            taxPercentage= 10;
        }
        else if (annualSalary> 1200000) {
            taxPercentage= 15;
        }

        float taxAnnual = (annualSalary*taxPercentage)/100;
        float netSalary= annualSalary-taxAnnual;
        System.out.printf("Tax Percentage: %.1f%%%n",taxPercentage);
        System.out.printf("Annual salary: %.2f%n",annualSalary);
        System.out.printf("Annual tax amount : %.2f%n", taxAnnual);
        System.out.printf("Net salary: %.2f%n",netSalary);







    }
}
