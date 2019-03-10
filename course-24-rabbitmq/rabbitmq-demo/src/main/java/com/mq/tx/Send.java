package com.mq.tx;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * AMQP事务机制
 *
 * txSelect：用户将当前channel设置成transaction模式
 * txCommit：用于提交事务
 * txRollback：回滚事务
 */
public class Send {

    private final static String queue_name = "hello_simple_queue_tx";

    /**
     * 使用了一对一队列做例子
     */
    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(queue_name, true, false, false, null);

        String message = "hello mq world";

        try {
            channel.txSelect();

            //模拟报错
            //int i = 1 / 0;

            channel.basicPublish("", queue_name, null, message.getBytes("UTF-8"));

            channel.txCommit();
        } catch (Exception e) {
            System.out.println("发送消息报错！！");

            channel.txRollback();

            //重试

        }

        System.out.println("[x] Sent " + message);

        channel.close();
        connection.close();
    }

}
