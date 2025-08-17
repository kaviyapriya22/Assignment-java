package org.ford.Assignment3;

public class HealthInsurance extends Policy{

    private double hospitalCoverage;
    public HealthInsurance(String policyNumber, String holderName, double amount, double hospitalCoverage) {
        super(policyNumber, holderName, amount);
        this.hospitalCoverage = hospitalCoverage;
    }

    @Override
    public void calculatePremium() {
        double baseRate = 0.02; // 2% of amount
        double premium = (super.getAmount() * baseRate) + (hospitalCoverage * 0.01 * super.getAmount());
        System.out.println("Premium rate: "+ premium);
    }


}
