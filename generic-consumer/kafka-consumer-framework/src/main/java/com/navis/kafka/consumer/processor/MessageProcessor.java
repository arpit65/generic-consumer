package com.navis.kafka.consumer.processor;

import com.navis.kafka.consumer.bean.KafkaEvent;

import java.util.List;

public interface MessageProcessor<K,V> {

    void process(KafkaEvent<K,V> inEvent);

    void process(List<KafkaEvent<K,V>> inEvents);
}
