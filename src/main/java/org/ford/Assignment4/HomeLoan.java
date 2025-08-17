package org.ford.Assignment4;

public class HomeLoan  extends Loan  implements ApprovalProcess{

    @Override
    public void  calculateEMI(double principal,double rate,int tenureMonths) {

        rate=rate /(12*100);
        double emi = (principal * rate* Math.pow(1+rate, tenureMonths))/(Math.pow(1+rate, tenureMonths)-1);
        System.out.println(" home loan EMI for $"+principal+" "+" is"+emi+" $"+ " "+"/month");




    }

    @Override
    public void approveLoan() {

        System.out.println(" Home loan approved");
    }
}
