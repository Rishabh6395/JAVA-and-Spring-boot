package org.example;

import org.example.notification.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notiii){
        this.notification = notiii;
    }

    public OrderService(){

    }

    public void placeOrder() {
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
