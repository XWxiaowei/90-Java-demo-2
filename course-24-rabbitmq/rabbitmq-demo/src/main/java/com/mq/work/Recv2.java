package com.mq.work;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Recv2 {

    private final static String queue_name = "hello_work_queue";

    /**
     * 简单一对一队列
     * @throws IOException
     * @throws TimeoutException
     */
    public static void main(String[] args) throws Exception {

        //同生产端
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        final Channel channel = connection.createChannel();

        channel.queueDeclare(queue_name, true, false, false, null);

        //不声明会默认轮询分发
        //声明之后是公平分发
        channel.basicQos(9);

                    Consumer consumer = new DefaultConsumer(channel){
                        @Override
                        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                            String message = new String(body, "UTF-8");
                            System.out.println("[2] received --> " + message);

                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }finally{
                    System.out.println("[2] done ");
                    //手动回执
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };

        boolean autoAck=false;
        channel.basicConsume(queue_name, autoAck, consumer);

    }

}
