package com.navis.kafka.job;

import com.navis.kafka.consumer.IConsumer;

public class ConsumerJob implements Runnable {

    private IConsumer consumer;

    public ConsumerJob(IConsumer inConsumer){
        this.consumer = inConsumer;
    }

    @Override
    public void run() {
        consumer.execute();
    }
}
