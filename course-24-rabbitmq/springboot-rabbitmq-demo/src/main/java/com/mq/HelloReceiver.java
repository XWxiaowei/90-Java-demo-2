package com.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.SPRING_BOOT_QUEUE)
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("You receiver a message : --> " + hello);
    }
}
