package com.navis.kafka.consumer.kafkatransformation.processor;

import com.navis.kafka.consumer.bean.KafkaEvent;
import com.navis.kafka.consumer.kafkatransformation.bean.TransformedEvent;
import com.navis.kafka.consumer.kafkatransformation.producer.KafkaProducer;
import com.navis.kafka.consumer.kafkatransformation.transformer.JsonTransformer;
import com.navis.kafka.consumer.processor.AbstractMessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class KafkaTransformationConsumer extends AbstractMessageProcessor<String, String> {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    JsonTransformer jsonTransformer;

    Date startTime;

    @Override
    public void process(KafkaEvent<String,String> inKafkaEvent) {
        if(startTime == null){
            startTime = new Date();
        }
        String inValue = inKafkaEvent.getValue();
        TransformedEvent transformedJson = jsonTransformer.transform(inValue);
        System.out.println("topic name "+transformedJson.getTopicName());
        System.out.println("key "+transformedJson.getKey());
        //System.out.println("value "+transformedJson.getEventJson());
        kafkaProducer.getKafkaTemplate().send(transformedJson.getTopicName(),transformedJson.getKey(),
                transformedJson.getEventJson());
        System.out.println("Start Time "+ startTime);
        System.out.println("End time "+ new Date());

    }

}
