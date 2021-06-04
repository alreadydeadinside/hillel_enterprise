package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.mq.BroadcastConfig;
import com.example.demo.mq.JsonHelper;
import com.example.demo.mq.MqObject;
import com.example.demo.repository.AbstractRespository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    private static String ROUTING_KEY_USER_IMPORTANT_WARN = "user.important.warn";
    private static String ROUTING_KEY_USER_IMPORTANT_ERROR = "user.important.error";

    @Autowired
    AbstractRespository abstractRespository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostConstruct
    public void exequteQuerry() {
        System.out.println("STARTING APP");
        abstractRespository.create(new User("roma", "tysh", "1@1.com", new Role("Role name 1 ")));
        abstractRespository.create(new User("roma2", "tysh2", "2@1.com", new Role("Role name 2 ")));
        abstractRespository.create(new User("roma3", "tysh3", "3@1.com", new Role("Role name 3 ")));
        abstractRespository.getAll().stream().forEach(System.out::println);
    }


    @Bean
    public ApplicationRunner runner(RabbitTemplate rabbitTemplate) {
        MqObject mqObject = new MqObject("name", 100);
        String message = " payload is broadcast";
        String objectMassage = JsonHelper.writeObject(mqObject);
        return args -> {
            rabbitTemplate.convertAndSend(BroadcastConfig.FANOUT_EXCHANGE_NAME, "", objectMassage);
            rabbitTemplate.convertAndSend(BroadcastConfig.TOPIC_EXCHANGE_NAME, ROUTING_KEY_USER_IMPORTANT_WARN, "topic important warn" + message);
            rabbitTemplate.convertAndSend(BroadcastConfig.TOPIC_EXCHANGE_NAME, ROUTING_KEY_USER_IMPORTANT_ERROR, "topic important error" + message);
        };

    }
}