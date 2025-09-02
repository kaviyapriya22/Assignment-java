package org.fooddelivery;

import org.fooddelivery.config.AppConfig;
import org.fooddelivery.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Card+ sms notification for normal order
        OrderService normalOrder = (OrderService) context.getBean("normalorder");
        normalOrder.placeOrder("Pizza", 500);
        System.out.println();


        // UPI + Email notification for Prime
        OrderService primeOrder = (OrderService) context.getBean("primeorderservice");
        primeOrder.placeOrder("Burger", 300);


    }



}