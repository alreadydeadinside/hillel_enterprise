package com.example.demo.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profile("local")
@Slf4j
@Component
public class ProfileExample {
    @PostConstruct
    public void init() {
        log.info("Local profile added");
    }
}
