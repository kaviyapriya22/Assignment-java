package org.ford.Assignment5;

public class TransactionProcessor {

    public void  process(int accNum,double amount){
        System.out.println(" Processin"+amount+" for the account number "+accNum);
    }

    public void  process(int fromAcc,int toAcc,double amount){
        System.out.println(" Processin"+amount+" from the account number "+fromAcc+ "  to the account number "+toAcc);
    }


}
