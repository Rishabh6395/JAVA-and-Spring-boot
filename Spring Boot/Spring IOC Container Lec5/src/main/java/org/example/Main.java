package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

//        PaymentService service = new PaymentService();
//        OrderService ord = new OrderService(service);
//        ord.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.Pay();
    }
}