package org.fooddelivery.payment;

import org.springframework.stereotype.Component;

@Component ("cardpaymentprocessor")
public class CardPaymentaProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment for amount: "+amount);

    }
}
