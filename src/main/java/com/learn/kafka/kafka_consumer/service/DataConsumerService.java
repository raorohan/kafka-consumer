package com.learn.kafka.kafka_consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DataConsumerService {

    @KafkaListener( topics = "products", groupId = "product-group")
    public void consumeData(String data){
        System.out.println(data);
    }
}
