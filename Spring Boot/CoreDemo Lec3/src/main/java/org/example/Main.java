package org.example;

import org.example.notification.NotificationService;
import org.example.notification.SmsNotificationService;


public class Main {
    public static void main(String[] args) {
        NotificationService notification = new SmsNotificationService();
//          OrderService order = new OrderService(notification);
            OrderService order = new OrderService();
            order.setNotification(notification);
            order.placeOrder();
        }
    };
