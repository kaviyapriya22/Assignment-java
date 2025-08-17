package org.ford.Assignment3;

import java.util.Scanner;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;

    public BankAccount(String accountNumber, double balance, String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(){

        System.out.println(" Enter the amount to be deposited: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        if (amount > 0){
            this.balance += amount;
        }
        else{
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(){
        System.out.println(" Enter the amount to be withdrawn: ");
        Scanner sc = new Scanner(System.in);
        double amount = Double.parseDouble(sc.nextLine());

        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}
