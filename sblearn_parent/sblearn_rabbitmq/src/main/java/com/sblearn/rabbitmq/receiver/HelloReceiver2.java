package com.sblearn.rabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@RabbitListener(queues = "topic.messages")
@Component
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String context) {
        System.out.println("Receiver2: " + context);
    }

}
