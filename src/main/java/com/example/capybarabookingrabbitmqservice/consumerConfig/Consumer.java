package com.example.capybarabookingrabbitmqservice.consumerConfig;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class Consumer {

    @RabbitListener(queues = "timeservice.queue")
    public void process(String message) {
        System.out.printf("Received from timeservice.queue : %s", new String(message.getBytes()));
    }
}
