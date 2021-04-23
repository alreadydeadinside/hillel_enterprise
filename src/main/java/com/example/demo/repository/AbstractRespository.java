package com.example.demo.repository;

import com.example.demo.entity.User;

import java.util.List;

public interface AbstractRespository {

    List<User> getAll();

    void create(User user);
}
