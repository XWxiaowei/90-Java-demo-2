package com.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/send")
    public void send () {

        //往队列发送信息
        amqpTemplate.convertAndSend(RabbitConfig.SPRING_BOOT_QUEUE,"hello springboot rabbitmq");

        //往交换机发送信息
        amqpTemplate.convertAndSend(RabbitConfig.SPRING_BOOT_EXCHANGE, RabbitConfig.SPRING_BOOT_BIND_KEY, "hello springboot exchange message!!");
    }

}
