package com.navis.kafka.topic.parse;

import com.navis.kafka.topic.bean.Topic;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Component
public class TopicXmlParser {

    public List<Topic> parse(String inFileName){

        //Create an instance of this class; it defines all the handler methods
        TopicDefaultHandler defaultHandler = new TopicDefaultHandler();

        SAXParserFactory spfac = SAXParserFactory.newInstance();
        InputStream is = null;
        try {
        //Now use the parser factory to create a SAXParser object
        SAXParser sp = spfac.newSAXParser();

        //Finally, tell the parser to parse the input and notify the handler
            is = getClass().getResourceAsStream(inFileName);
            sp.parse(is, defaultHandler);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }finally{
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return defaultHandler.getData();
    }


}
