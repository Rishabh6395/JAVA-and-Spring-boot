package org.example.notification;

public class EmailService implements  NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Sent Notification by email");
    }
}
