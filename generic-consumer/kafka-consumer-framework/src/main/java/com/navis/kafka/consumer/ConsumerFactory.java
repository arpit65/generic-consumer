package com.navis.kafka.consumer;

import com.navis.kafka.enums.MessageTypeEnum;
import com.navis.kafka.consumer.bean.TopicVo;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFactory {

    public IConsumer getConsumer(TopicVo inTopicVo){
        if(inTopicVo.getMessageType().equals(MessageTypeEnum.JSON.getType())){
            return new JsonConsumer(inTopicVo);
        }else{
            System.out.println("Define Message Type");
            return null;
        }
    }
}
