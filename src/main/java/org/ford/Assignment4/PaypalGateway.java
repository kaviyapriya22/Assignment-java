package org.ford.oops;

public class PaypalGateway extends PaymentGateway implements PaymentProcessor , RefundProcessor {

    public PaypalGateway(String apikey, String apiURL) {
        super(apikey, apiURL);


    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment amount"+amount+" via paypal ");
    }

    @Override
    public void refundProcess(double amount) {
        System.out.println("Refunding  amount"+amount+" via paypal ");
    }
}
