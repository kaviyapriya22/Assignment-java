package org.ford.Assignment3;

import java.util.Scanner;

public class LifeInsurance extends Policy {

    private String nominee;

    public LifeInsurance(String number,String name,double amount,String nominee){
        super(number,name,amount);
        this.nominee = nominee;

    }

    public void calculatePremium(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mortality rate risk : ");
        double mortalityRate = sc.nextDouble();
        System.out.println("Enter the loading: ");
        double loading = sc.nextDouble();

        double premium = (mortalityRate * super.getAmount() )+loading;
        System.out.println("Premium  amount : "+premium);

    }
}
