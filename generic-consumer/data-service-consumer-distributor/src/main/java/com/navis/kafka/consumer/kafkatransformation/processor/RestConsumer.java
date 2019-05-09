package com.navis.kafka.consumer.kafkatransformation.processor;

import com.navis.kafka.consumer.bean.KafkaEvent;
import com.navis.kafka.consumer.processor.AbstractMessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Component
public class RestConsumer extends AbstractMessageProcessor<String, String> {

    @Autowired
    private RestTemplate restTemplate;

    Date startTime;
    int counter = 0;

    @Override
    public void process(KafkaEvent<String,String> inKafkaEvent) {
        if(startTime == null){
            startTime = new Date();
        }
        System.out.println("sending for no sql transformation");
        postToService(inKafkaEvent.getValue());
        System.out.println("Start Time "+ startTime);
        System.out.println("no of events "+counter++);
        System.out.println("End time "+ new Date());
    }


    private void postToService(@Payload String jsonMessage) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Content-Type", "application/json");
        HttpEntity<String> request = new HttpEntity<>(jsonMessage, httpHeaders);
        String response = null;
        try {
            response = restTemplate.postForObject("http://localhost:8081/nosqljoin", request, String.class);
        } catch (RestClientException e) {
            e.printStackTrace();
        }
    }
}
