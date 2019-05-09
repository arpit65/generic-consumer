package com.navis.kafka.consumer.kafkatransformation.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TransformedEvent {

    private String key;

    private String topicName;

    private String eventJson;
}
