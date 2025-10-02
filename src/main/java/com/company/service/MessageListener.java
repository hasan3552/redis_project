package com.company.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = "myQueue")
    public void receiveMessage(Object message) {
        System.out.println("Qabul qilindi: " + message);
    }
}