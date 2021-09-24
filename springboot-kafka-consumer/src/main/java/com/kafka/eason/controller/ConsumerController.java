package com.kafka.eason.controller;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者监听topic=testTopic的消息
 *
 * @author Lynch
 */
@Component
public class ConsumerController {

    @KafkaListener(topics = "wtopic04")
    public void onMessage(ConsumerRecord<?, ?> record){
        //insertIntoDb(buffer);//这里为插入数据库代码
        //System.out.println("message: " + message);
        System.out.println("简单消费，record："+record.topic()+"-"+record.partition()+"-"+record.value());

    }

}
