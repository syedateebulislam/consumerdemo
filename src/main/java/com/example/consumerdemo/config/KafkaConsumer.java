package com.example.consumerdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.example.consumerdemo.Constants.Constant.kafkaGroupId;
import static com.example.consumerdemo.Constants.Constant.kafkaTopic;

@Configuration
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = kafkaTopic,groupId = kafkaGroupId)
    public void kafkaConsumerTest(String value){

        log.info("kafka consumer - {}",value);

    }


}
