package org.fooddelivery.order;

import org.fooddelivery.notification.NotificationService;
import org.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("normalorder")
public class NormalOrderService implements OrderService {

    private PaymentProcessor paymentgateway;

    @Autowired
    @Qualifier("emailNotificationService")
    private NotificationService notificationservice;

    @Autowired
    public NormalOrderService(@Qualifier("cardpaymentprocessor") PaymentProcessor paymentgateway) {
        this.paymentgateway = paymentgateway;

    }

    @Override
    public void placeOrder(String item, double price) {

        System.out.println("Placing order for item: " + item);
        paymentgateway.processPayment(price);
        notificationservice.sendNotification("Normal order placed for item: " + item);


    }


}
