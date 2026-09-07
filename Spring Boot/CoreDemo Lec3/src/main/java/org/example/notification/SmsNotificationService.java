package org.example.notification;

public class SmsNotificationService  implements  NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Sent Notification via SMS");
    }
}
