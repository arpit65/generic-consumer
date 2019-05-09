package com.navis.kafka.consumer.processor;

import com.navis.kafka.consumer.bean.KafkaEvent;

import java.util.List;

public class AbstractMessageProcessor<K,V> implements MessageProcessor<K,V> {

    public void process(KafkaEvent<K,V> inKafkaEvent){}

    public void process(List<KafkaEvent<K,V>> inEvents){}


}
