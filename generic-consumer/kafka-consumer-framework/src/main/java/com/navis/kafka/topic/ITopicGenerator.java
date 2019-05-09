package com.navis.kafka.topic;

import com.navis.kafka.consumer.bean.TopicVo;

import java.util.List;

public interface ITopicGenerator {
    List<TopicVo> getTopic();

    int getTotalConsumer();
}
