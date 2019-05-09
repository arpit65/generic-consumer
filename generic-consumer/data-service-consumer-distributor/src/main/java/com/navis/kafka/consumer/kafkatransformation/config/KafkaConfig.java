/*
 * Copyright (c) 2017 Navis LLC. All Rights Reserved.
 *
 */
package com.navis.kafka.consumer.kafkatransformation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Kafka Configuration class
 */
@Component
@PropertySource("classpath:kafka_conf.properties")
public class KafkaConfig {

    @Value("${kafka.server.config}")
    private String kafkaServerConfig;

    public String getKafkaServerConfig() {
        return kafkaServerConfig;
    }

    public void setKafkaServerConfig(String kafkaServerConfig) {
        this.kafkaServerConfig = kafkaServerConfig;
    }
}
