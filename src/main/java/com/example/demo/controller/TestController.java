package com.example.demo.controller;

import com.example.demo.AOP.SomeService;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    SomeService someService;

    @GetMapping("/test")
    public void test() {
//        try {
//            someService.serve();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
          //  testRepository.testInsert();
     //    testRepository.count();
        someService.methodForLogging(List.of("ONE", "TWO"));

    }
}
