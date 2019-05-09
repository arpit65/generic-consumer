/*
 * Copyright (c) 2017 Navis LLC. All Rights Reserved.
 *
 */
package com.navis.kafka.consumer.kafkatransformation.producer;

import com.navis.kafka.consumer.kafkatransformation.config.KafkaConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Kafka producer configuration
 * @author <a href="mailto:deepak.kumar@navis.com">Deepak Kumar</a>
 */
@Component
public class KafkaProducer {

    //private final Class<T> typeParameter;

    private KafkaTemplate<String,Object> kafkaTemplate;

    @Autowired
    private KafkaConfig kafkaConfig;

    @PostConstruct
    private void initializeKafkaTemplate(){
        kafkaTemplate = new KafkaTemplate<>(producerFactory());
    }

    /**
     * Set the kafka producer configuration
     * @return ProducerFactory Obj
     */
    private ProducerFactory<String,Object> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                kafkaConfig.getKafkaServerConfig());
        configProps.put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        configProps.put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class);
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    /**
     * initialize kafka template bean
     * @return kafka template object
     */

    public KafkaTemplate<String,Object> getKafkaTemplate() {
        return kafkaTemplate;
    }

    public KafkaConfig getKafkaConfig() {
        return kafkaConfig;
    }
}
