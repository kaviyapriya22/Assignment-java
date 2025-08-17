package org.ford.Assignment6;

import java.util.Scanner;

public class ATM {

    double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {

        if (amount > balance){
            throw new ArithmeticException("Insufficient Balance");
        }
        else if (amount <=0){
            throw new IllegalArgumentException("Invalid  amount entered");
        }
        balance-=amount;
        System.out.println(" Amount detected succesfullly");





    }
}
