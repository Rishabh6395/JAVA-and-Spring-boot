package org.example.notification;

public class OrderService {

    NotificationService nofification;

    public OrderService(NotificationService notification){
        this.nofification = notification;
    }

    public void placeOrder() {
        System.out.println("Order Placed");
        nofification.sendNotification();
    }
}
