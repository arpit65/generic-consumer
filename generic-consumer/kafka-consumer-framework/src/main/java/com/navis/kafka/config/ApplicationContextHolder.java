package com.navis.kafka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Configuration
public class ApplicationContextHolder {

    @Autowired
    private ApplicationContext applicationContext;

    private static ApplicationContextHolder INSTANCE;

    @PostConstruct
    public void initialize(){
        INSTANCE = this;
    }

    public static <T> T getBean(Class<T> inClass){
        return INSTANCE.applicationContext.getBean(inClass);
    }

    public static Object getBean(String inBean){
        return INSTANCE.applicationContext.getBean(inBean);
    }

}
