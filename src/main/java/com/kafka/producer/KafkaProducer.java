package com.kafka.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        log.info(String.format("$$ -> Producing message --> %s",message));
        this.kafkaTemplate.send("user",message);
    }
}
