package com.navis.kafka.topic.parse;

import com.navis.kafka.topic.bean.ConsumerGroup;
import com.navis.kafka.topic.bean.Topic;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class TopicDefaultHandler extends DefaultHandler{

    private String temp;

    private Topic topic;

    private ConsumerGroup consumerGroup;

    private List<Topic> topics;

   // @Autowired
   // private ApplicationContext _appContext;

    /*
        * When the parser encounters plain text (not XML elements),
        * it calls(this method, which accumulates them in a string buffer
        */
    public void characters(char[] buffer, int start, int length) {
        temp = new String(buffer, start, length);
    }


    /*
     * Every time the parser encounters the beginning of a new element,
     * it calls this method, which resets the string buffer
     */
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes) throws SAXException {

        temp = "";

        if (qName.equalsIgnoreCase("Topic")) {
            topic = new Topic();
            topic.setConsumerGroups(new ArrayList<>());
            topic.setName(attributes.getValue("name"));
            topic.setKafkabroker(attributes.getValue("kafkabroker"));
            topic.setType(attributes.getValue("type"));
            if(attributes.getValue("maxrecords") != null){
                topic.setMaxRecords(Integer.parseInt(attributes.getValue("maxrecords")));
            }

        }

        if (qName.equalsIgnoreCase("ConsumerGroup")) {
            consumerGroup = new ConsumerGroup();
            consumerGroup.setConsumer(Integer.parseInt(attributes.getValue("consumer")));
            consumerGroup.setName(attributes.getValue("name"));
           // MessageProcessor messageProcessor = (MessageProcessor) _appContext.getBean(attributes.getValue("ref"));
            consumerGroup.setRef(attributes.getValue("ref"));
        }
    }

    /*
     * When the parser encounters the end of an element, it calls this method
     */
    public void endElement(String uri, String localName, String qName)
            throws SAXException {

        if (qName.equalsIgnoreCase("Topic")) {
            // add it to the list
            if(topics == null){
                topics = new ArrayList<>();
            }
            topics.add(topic);

        } else if (qName.equalsIgnoreCase("ConsumerGroup")) {
            topic.getConsumerGroups().add(consumerGroup);
        }
    }

    public List<Topic> getData(){
        return topics;
    }


}
