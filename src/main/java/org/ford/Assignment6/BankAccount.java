package org.ford.Assignment6;

public class BankAccount {

    static double interestRate = 5000;
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber,double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Balance: "+this.balance);
        System.out.println("Interest Rate: "+BankAccount.interestRate);
    }


    public static void updateInterestRate(double rate) {
        System.out.println("Old Interest Rate: "+interestRate);
        interestRate = rate;
        System.out.println(" Newly updated interest rate "+rate);
    }


}
