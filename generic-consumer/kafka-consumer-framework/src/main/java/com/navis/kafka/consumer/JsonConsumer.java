package com.navis.kafka.consumer;

import com.navis.kafka.consumer.bean.TopicVo;
import org.apache.kafka.common.serialization.StringDeserializer;

public class JsonConsumer extends AbstractConsumer<String,String> {

    public JsonConsumer(TopicVo topicVo){
        super(topicVo);
    }


    @Override
    public String getKeyDeserializer() {
        return StringDeserializer.class.getName();
    }

    @Override
    public String getValueDeserializer() {
        return StringDeserializer.class.getName();
    }



}
