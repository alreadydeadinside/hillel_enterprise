package com.example.demo;

import com.example.demo.entity.*;
import com.example.demo.repository.AbstractRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

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
}
