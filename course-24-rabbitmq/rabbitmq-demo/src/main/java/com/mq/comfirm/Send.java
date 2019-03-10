package com.mq.comfirm;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * comfirm模式--同步模式
 */
public class Send {

    private final static String queue_name = "hello_simple_queue_comfirm";

    /**
     * 使用了一对一队列做例子
     */
    public static void main(String[] args) throws Exception {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(queue_name, true, false, false, null);

        String message = "hello mq world";

        //发送消息之前转换通道为Comfirm模式
        channel.confirmSelect();

        //可以发送多天再确认！
        channel.basicPublish("", queue_name, null, message.getBytes("UTF-8"));
        System.out.println("[x] Sent " + message);

        //使用waitForConfirms等待确认，串行模式（同步）
        if(channel.waitForConfirms()) {
            System.out.println("消息发送成功~~");
        } else {

            System.out.println("消息发送失败！！！");
        }

        channel.close();
        connection.close();
    }

}
