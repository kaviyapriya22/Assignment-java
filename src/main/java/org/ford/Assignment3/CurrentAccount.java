package org.ford.Assignment3;

import java.util.Scanner;

public class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, String name, double overdraftLimit) {
        super(accountNumber,balance,name);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw() {
        System.out.println(" Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.nextLine());

        if (super.getBalance() - amount >= overdraftLimit){
            super.setBalance(super.getBalance() - amount);
        }
        else{
            System.out.println(" The amount to be withdrawn is overdraft limit");
        }

    }

}
