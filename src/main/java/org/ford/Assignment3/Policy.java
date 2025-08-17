package org.ford.Assignment3;

public class Policy {

    private String pNumber ;
    private String pName ;
    private double amount;

    public Policy(String pNumber, String pName, double amount){
        this.pNumber = pNumber;
        this.pName = pName;
        this.amount = amount;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void calculatePremium(){
        System.out.println("Base  amount : "+amount);
    }
}
