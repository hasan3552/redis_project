package com.company.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {


    @Value("${rabbitmq.queue.name}")
    public String queue;

    @RabbitListener(queues = "myQueue") // Queue nomi to'g'ri bo'lishi kerak
    public void receiveMessage(Object message) {
        System.out.println("Qabul qilindi: " + message);
    }
}
