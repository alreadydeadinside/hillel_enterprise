package com.example.demo;

import com.example.demo.model.OldUser;
import com.example.demo.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("Final log");
    }

    @PostConstruct
    public void postConstruct() {
        List<OldUser> users = userService.getAll();

        for (OldUser user : users) {
            log.info(user.toString());
        }
    }
}
