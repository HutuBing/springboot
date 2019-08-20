package com.sblearn.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.messages")
public class HelloReceiver {

    @RabbitHandler
    public void process(String context) {
        System.out.println("Receiver1: " + context);
    }

}
