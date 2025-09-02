package org.fooddelivery.notification;

import org.springframework.stereotype.Component;

@Component ("emailNotificationService")
public class EmailNotificationService implements NotificationService {


    @Override
    public void sendNotification(String message) {
        System.out.println("Email message:  " + message);
    }
}
