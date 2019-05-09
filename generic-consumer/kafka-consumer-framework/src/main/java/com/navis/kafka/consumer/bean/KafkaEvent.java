package com.navis.kafka.consumer.bean;

public class KafkaEvent<K,V> {
    private String topicName;
    private long offset;
    private int partition;
    private K key;
    private V value;

    public KafkaEvent(String topicName, long offset, int partition, K key, V value) {
        this.topicName = topicName;
        this.offset = offset;
        this.partition = partition;
        this.key = key;
        this.value = value;
    }

    public String getTopicName() {
        return topicName;
    }

    public long getOffset() {
        return offset;
    }

    public int getPartition() {
        return partition;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}