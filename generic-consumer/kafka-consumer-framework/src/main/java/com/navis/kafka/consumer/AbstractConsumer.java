package com.navis.kafka.consumer;

import com.navis.kafka.consumer.bean.KafkaEvent;
import com.navis.kafka.consumer.bean.TopicVo;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public abstract class AbstractConsumer<K, V> implements IConsumer {

    private final Consumer<K, V> consumer;
    private TopicVo topicVo;

    public AbstractConsumer(TopicVo inTopic){
        topicVo = inTopic;
        consumer = create();
    }


    private Consumer<K, V> create() {

        final Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, topicVo.getBrokerServers());
        props.put(ConsumerConfig.GROUP_ID_CONFIG, topicVo.getConsumerGroupName());
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,getKeyDeserializer());
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,getValueDeserializer());
        props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, topicVo.getMaxrecords());
        // Create the consumer using props.
        final Consumer<K, V> consumer =new KafkaConsumer<K, V>(props);
        consumer.subscribe(Collections.singletonList(topicVo.getTopicName()));
        return consumer;

    }

    public abstract String getKeyDeserializer();

    public abstract String getValueDeserializer();

    @Override
    public void execute() {

        while (true) {
            final ConsumerRecords<K, V> consumerRecords= consumer.poll(100);
            if(consumerRecords == null || consumerRecords.isEmpty()){
                continue;
            }

            List<KafkaEvent<K,V>> kafkaEvents = new ArrayList<>(consumerRecords.count());
            consumerRecords.forEach(record -> {
                KafkaEvent<K, V> kafkaEvent = new KafkaEvent<>(topicVo.getTopicName(),record.offset(),
                        record.partition(),record.key(),record.value());
                topicVo.getMessageProcessor().process(kafkaEvent);
                kafkaEvents.add(kafkaEvent);
            });
            if(!kafkaEvents.isEmpty()){
                topicVo.getMessageProcessor().process(kafkaEvents);
            }
            consumer.commitAsync();
        }

    }


    @Override
    protected  void finalize(){
        if(consumer != null){
            consumer.close();
        }
    }

}
