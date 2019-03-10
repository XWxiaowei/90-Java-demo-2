package com.mq.pusb;

import com.rabbitmq.client.*;

import java.io.IOException;

/**
 * 声明交换机，模式是fanout
 * 声明一个队列绑定到交换机上
 * 消费者监听通道
 */
public class ReceiveLogs {
    private static final String EXCHANGE_NAME = "logs";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

        // 该语句得到一个随机名称的Queue，该queue的类型为non-durable、exclusive、auto-delete的，
        // 将该queue绑定到上面的exchange上接收消息。
        String queueName = channel.queueDeclare().getQueue();

        // 第三个参数Routing key为空，即所有的消息都接收。
        // 如果这个值不为空，在exchange type为“fanout”方式下该值被忽略！
        channel.queueBind(queueName, EXCHANGE_NAME, "");

        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        };
        channel.basicConsume(queueName, true, consumer);
    }
}