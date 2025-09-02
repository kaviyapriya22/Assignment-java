package org.fooddelivery.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.fooddelivery.payment.CardPaymentaProcessor;
import org.fooddelivery.payment.PaymentProcessor;
import org.fooddelivery.payment.UPIPaymentProcessor;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan (basePackages = "org.fooddelivery")
public class AppConfig {

    @Bean("cardpaymentprocessor")
    public PaymentProcessor cardPaymentProcessor() {
        return new CardPaymentaProcessor();
    }

    @Bean("upipaymentprocessor")
    public PaymentProcessor upiPaymentProcessor() {
        return new UPIPaymentProcessor();
    }
}
