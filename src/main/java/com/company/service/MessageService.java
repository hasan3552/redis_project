package com.company.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


    @Value("${rabbitmq.queue.name}")
    private String queue;
    @Value("${rabbitmq.exchange.name}")
    private String routingKey;
    @Value("${rabbitmq.routing.key}")
    private String exchange;
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void sendMessage(Object message) {
        rabbitTemplate.convertAndSend("myExchange", "myKey", message);
        System.out.println("Xabar yuborildi: " + message);
    }
}
