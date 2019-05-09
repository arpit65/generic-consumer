package com.navis.kafka.consumer.bean;

import com.navis.kafka.consumer.processor.MessageProcessor;

public class TopicVo {

    private String clientName;

    private String topicName;

    private String consumerGroupName;

    private Integer consumer;

    private MessageProcessor messageProcessor;

    private String brokerServers;

    private Integer maxrecords;

    private String messageType;


    public TopicVo(String inClientName, String inTopicName, String inConsumerGrpName,Integer inConsumer,
                   MessageProcessor inMessageProcessor,String inBrokerServers,Integer inMaxrecords,String inMessageType){
        this.clientName = inClientName;
        this.topicName = inTopicName;
        this.consumerGroupName = inConsumerGrpName;
        this.consumer = inConsumer;
        this.messageProcessor = inMessageProcessor;
        this.brokerServers = inBrokerServers;
        this.maxrecords = inMaxrecords;
        this.messageType = inMessageType;
    }


    public String getClientName() {
        return clientName;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    public Integer getConsumer() {
        return consumer;
    }

    public MessageProcessor getMessageProcessor() {
        return messageProcessor;
    }

    public String getBrokerServers() {
        return brokerServers;
    }

    public Integer getMaxrecords() {
        return maxrecords;
    }

    public String getMessageType() {
        return messageType;
    }
}
