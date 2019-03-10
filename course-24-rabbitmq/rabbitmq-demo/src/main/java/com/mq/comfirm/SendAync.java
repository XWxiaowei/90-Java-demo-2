package com.mq.comfirm;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmListener;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * comfirm模式--同步模式
 */
public class SendAync {

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

        String message = "hello mq world comfirm aync";

        //发送消息之前转换通道为Comfirm模式
        channel.confirmSelect();

        //未确认的消息标识
        final SortedSet<Long> confirmSet = Collections.synchronizedSortedSet(new TreeSet<Long>());

        //通道监听
        channel.addConfirmListener(new ConfirmListener() {

            //没问题的回调ack方法
            //每回调一次handleAck方法，unconfirm集合删掉相应的一条（multiple=false） 或多条（multiple=true）记录。
            public void handleAck(long deliveryTag, boolean multiple) throws IOException {
                System.out.println("正常回调--> deliveryTag-" + deliveryTag + "  multiple-" + multiple);
                if(multiple) {
                    confirmSet.headSet(deliveryTag + 1).clear();
                } else {
                    confirmSet.remove(deliveryTag);
                }
            }

            //有问题的回调nack方法，1s，3s，10s
            public void handleNack(long deliveryTag, boolean multiple) throws IOException {
                System.out.println("异常回调--> deliveryTag-" + deliveryTag + "  multiple-" + multiple);
            }
        });
        // TODO  死循环

        while (true) {
            //可以获取到通道的
            long nextSeqNo = channel.getNextPublishSeqNo();
            channel.basicPublish("", queue_name, null, (message + nextSeqNo).getBytes("UTF-8"));
            System.out.println("[x] Sent " + (message + nextSeqNo));

            //添加到队列
            confirmSet.add(nextSeqNo);
        }
    }
}
