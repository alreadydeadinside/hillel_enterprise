package com.example.demo.dao;

import lombok.*;

@Data
public class UserDao {


    private String firstName;

    private String secondName;

    private String email;


    public UserDao(String firstName, String secondName, String email) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }
}