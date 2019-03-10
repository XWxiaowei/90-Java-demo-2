package com.mq.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class Send {

    private final static String queue_name = "hello_work_queue";

    /**
     * 工作一对多队列
     * 相比一对一队列，之多了channel.basicQos(1);
     */
    public static void main(String[] args) throws Exception {
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

        /**
         * 每个消费者 发送确认消息之前,消息队列不发送下一个消息到消费者,一次只处理一个消息
         * 限制发送给同一个消费者 不得超过一条消息
         */
        //会告诉RabbitMQ不要同时给一个消费者推送多于N个消息，即一旦有N个消息还没有ack，则该consumer将block掉，直到有消息ack
        channel.basicQos(1);//最多允许n条消息未被应答（ack）


        for (int i = 0; i <50; i++) {

            String msg="hello --> " + i;
            System.out.println("[ WQ ]send:" + msg);

            channel.basicPublish("", queue_name, null, msg.getBytes());
            Thread.sleep(i*5);
        }

        channel.close();
        connection.close();
    }

}
