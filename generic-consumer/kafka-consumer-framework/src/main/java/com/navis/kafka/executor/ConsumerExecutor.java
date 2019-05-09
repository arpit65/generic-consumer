package com.navis.kafka.executor;

import com.navis.kafka.consumer.bean.TopicVo;
import com.navis.kafka.consumer.ConsumerFactory;
import com.navis.kafka.job.ConsumerJob;
import com.navis.kafka.topic.ITopicGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Component
public class ConsumerExecutor implements IExecutor {

    @Autowired
    private ITopicGenerator topicGenerator;

    @Autowired
    private ConsumerFactory consumerFactory;

    private ExecutorService executor;

    @Override
    public void execute() {
        List<TopicVo> topics = topicGenerator.getTopic();
        executor = Executors.newFixedThreadPool(topicGenerator.getTotalConsumer());
        int totalConsumer = topicGenerator.getTotalConsumer();
        if(totalConsumer == 0){
            return;
        }
        for (TopicVo topic : topics) {
            int consumer = topic.getConsumer();
            for (int count = 0; count < consumer; count++) {
                executor.execute(new ConsumerJob(consumerFactory.getConsumer(topic)));
            }
        }
    }

}
