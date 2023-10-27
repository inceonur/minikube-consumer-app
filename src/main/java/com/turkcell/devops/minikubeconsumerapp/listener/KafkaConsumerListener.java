package com.turkcell.devops.minikubeconsumerapp.listener;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumerListener {
    @KafkaListener(topics = "{spring.kafka.topic.name}", groupId = "${spring.kafka.group-id}")
    public void listen(String message) {
        System.out.printf("Received Message: [%s] %n", message);
    }
}
