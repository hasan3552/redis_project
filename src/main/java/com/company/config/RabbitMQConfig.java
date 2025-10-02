//package com.company.config;
//
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RabbitMQConfig {
//
//    @Value("${rabbitmq.queue.name}")
//    private String queueName;
//
//    @Value("${rabbitmq.exchange.name}")
//    private String exchangeName;
//
//    @Value("${rabbitmq.routing.key}")
//    private String routingKey;
//
//    @Bean
//    Queue myQueue() {
//        return new Queue(queueName, true);
//    }
//
//    @Bean
//    DirectExchange myExchange() {
//        return new DirectExchange(exchangeName);
//    }
//
//    @Bean
//    Binding binding(Queue queue, DirectExchange exchange) {
//        return BindingBuilder.bind(queue).to(exchange).with(routingKey);
//    }
//}