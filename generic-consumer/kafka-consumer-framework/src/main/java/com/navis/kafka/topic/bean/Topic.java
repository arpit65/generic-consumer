package com.navis.kafka.topic.bean;

import java.util.List;

public class Topic {

    private String name;

    private String kafkabroker;

    private int maxRecords;

    private List<ConsumerGroup> consumerGroups;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKafkabroker() {
        return kafkabroker;
    }

    public void setKafkabroker(String kafkabroker) {
        this.kafkabroker = kafkabroker;
    }

    public List<ConsumerGroup> getConsumerGroups() {
        return consumerGroups;
    }

    public void setConsumerGroups(List<ConsumerGroup> consumerGroups) {
        this.consumerGroups = consumerGroups;
    }

    public int getMaxRecords() {
        return maxRecords;
    }

    public void setMaxRecords(int maxRecords) {
        this.maxRecords = maxRecords;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
