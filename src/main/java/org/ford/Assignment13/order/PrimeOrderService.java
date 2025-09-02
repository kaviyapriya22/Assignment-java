package org.fooddelivery.order;

import org.fooddelivery.notification.NotificationService;
import org.fooddelivery.payment.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


//@Service ("primeorderservice")
//public class PrimeOrderService implements OrderService {
//
//    private PaymentProcessor paymentgateway;
//    private NotificationService notificationservice;
//
//    @Autowired
//    public PrimeOrderService(@Qualifier("upipaymentprocessor") PaymentProcessor paymentgateway,
//                              @Qualifier ("emailNotificationService") NotificationService notificationservice ) {
//        this.paymentgateway = paymentgateway;
//        this.notificationservice = notificationservice;
//    }
//
//
//
//
//    @Override
//    public void placeOrder(String item, double price) {
//
//        System.out.println("Placing order for item: " + item);
//        paymentgateway.processPayment(price);
//        notificationservice.sendNotification("Prime order placed for item: " + item);
//
//
//    }
//}

@Service ("primeorderservice")
public class PrimeOrderService implements OrderService {

    private PaymentProcessor paymentgateway;

    @Autowired
    @Qualifier("smsNotificationService")
    private NotificationService notificationservice;

    @Autowired
    public PrimeOrderService(@Qualifier("upipaymentprocessor") PaymentProcessor paymentgateway) {
        this.paymentgateway = paymentgateway;

    }




    @Override
    public void placeOrder(String item, double price) {

        System.out.println("Placing order for item: " + item);
        paymentgateway.processPayment(price);
        notificationservice.sendNotification("Prime order placed for item: " + item);


    }
}

