//package com.company.config;
//
//import org.springframework.amqp.core.*;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Service;
//
//@Configuration
//public class RabbitMQConfig {
//
//    public static final String QUEUE = "rabbitQueue";
//    public static final String EXCHANGE = "rabbitExchange";
//    public static final String ROUTING_KEY = "rabbitKey";
//
//
//    @Bean
//    public Queue queue() {
//        return new Queue(QUEUE, true);
//    }
//
//    @Bean
//    public DirectExchange exchange() {
//        return new DirectExchange(EXCHANGE);
//    }
//
//    @Bean
//    public Binding binding(Queue queue, DirectExchange exchange) {
//        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
//    }
//
//}
