package com.navis.kafka;

import com.navis.kafka.executor.ConsumerExecutor;
import com.navis.kafka.executor.IExecutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        IExecutor executor = applicationContext.getBean(ConsumerExecutor.class);
        executor.execute();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
