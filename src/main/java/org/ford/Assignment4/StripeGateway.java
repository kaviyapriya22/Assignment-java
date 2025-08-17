package org.ford.oops;

public class StripeGateway extends PaymentGateway implements PaymentProcessor, RefundProcessor {

    public StripeGateway( String apikey, String apiURL) {
        super(apikey, apiURL);
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment of amount "+amount+" "+"... via stripe");
    }
    @Override
    public void refundProcess(double amount) {
        System.out.println("Refunding  amount"+amount+" "+"... via stripe");
    }

}
