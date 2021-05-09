package com.example.demo.conditions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
@DatabaseType("MYSQL-LOCAL")
public class DatabaseAnnotation {
    @PostConstruct
    public void init() {
        log.info("----------DatabaseTypeAnnotationExampleBean created");
    }
}
