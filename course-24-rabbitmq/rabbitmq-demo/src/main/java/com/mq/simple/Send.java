package com.mq.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Send {

    private final static String queue_name = "hello_simple_queue";

    /**
     * 简单一对一队列
     * @throws IOException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        //创建链接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //默认链接的主机名,RabbitMQ-Server安装在本机，所以可以直接用127.0.0.1或者localhost
        factory.setHost("localhost");
        //创建链接
        Connection connection = factory.newConnection();
        //创建信息管道
        Channel channel = connection.createChannel();

        //创建一个名为hello_queue的队列，防止队列不存在
        //进行信息声明                    1.队列名2.是否持久化，3是否局限与链接，4不再使用是否删除，5其他的属性
        channel.queueDeclare(queue_name, true, false, false, null);

        String message = "hello mq world";
        //第一参数空表示使用默认exchange，第二参数表示发送到的queue，第四参数是发送的消息是（字节数组）
        channel.basicPublish("", queue_name, null, message.getBytes("UTF-8"));

        System.out.println("[x] Sent " + message);

        channel.close();
        connection.close();
    }

}
