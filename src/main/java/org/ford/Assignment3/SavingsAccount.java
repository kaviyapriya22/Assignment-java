package org.ford.Assignment3;
import java.util.Scanner;

public class SavingsAccount extends BankAccount {

    double interestRate;
    public SavingsAccount (String accountNum, double balance, String name, double interestRate) {
        super(accountNum, balance, name);
        this.interestRate = interestRate;


    }

    public void calculateInterestRate(){
        System.out.println(" Enter the time period to calculate interest rate: ");
        Scanner input = new Scanner(System.in);
        double timePeriod = Double.parseDouble(input.nextLine());

        double interest  = super.getBalance()*(interestRate/100)*timePeriod;
        System.out.println(" The interest rate is "+interest);




    }
}
