package com.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitConfig.SPRING_BOOT_EXCHANGE_queue)
public class ExchangeReceiver {

    @RabbitHandler
    public void process(String mess) {
        System.out.println("You receiver a from exchange message : --> " + mess);
    }
}
