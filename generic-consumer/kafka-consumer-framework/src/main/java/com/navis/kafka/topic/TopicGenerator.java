package com.navis.kafka.topic;

import com.navis.kafka.consumer.bean.TopicVo;
import com.navis.kafka.config.ApplicationContextHolder;
import com.navis.kafka.consumer.processor.MessageProcessor;
import com.navis.kafka.topic.bean.ConsumerGroup;
import com.navis.kafka.topic.bean.Topic;
import com.navis.kafka.topic.parse.TopicXmlParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;

@Component
public class TopicGenerator implements ITopicGenerator{

    @Autowired
    private TopicXmlParser topicXmlParser;

    private List<TopicVo> n4TopicVo = new LinkedList<>();

    private Integer totalConsumer = 0;


    @PostConstruct
    public void initializeTopic(){
        try{
            List<Topic> n4Topic = topicXmlParser.parse("/topic.xml");
            if(n4Topic == null || n4Topic.isEmpty()){
                //TODO log error no topics defined
                return;
            }

            InetAddress myHost = InetAddress.getLocalHost();
            String clientName = myHost.getHostName();

            for(Topic topic : n4Topic){
                for(ConsumerGroup consumerGroup : topic.getConsumerGroups()){
                    TopicVo topicVo = new TopicVo(clientName,topic.getName(),consumerGroup.getName(),
                            consumerGroup.getConsumer(),
                            getMessageProcessorBean(consumerGroup.getRef()),
                            topic.getKafkabroker(),topic.getMaxRecords(),topic.getType());
                    n4TopicVo.add(topicVo);
                    totalConsumer = consumerGroup.getConsumer()+totalConsumer;
                }

            }
        }catch(UnknownHostException ex){
            // TODO Log error
            ex.printStackTrace();
        }

    }

    private static MessageProcessor getMessageProcessorBean(String inBeanId){
        return (MessageProcessor) ApplicationContextHolder.getBean(inBeanId);
    }


    @Override
    public List<TopicVo> getTopic() {
        return n4TopicVo;
    }

    @Override
    public int getTotalConsumer(){
        return totalConsumer;
    }


}
