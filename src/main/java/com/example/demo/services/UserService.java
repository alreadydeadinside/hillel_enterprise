package com.example.demo.services;

import java.util.List;

public interface UserService<T> {

    void create(T t);
    List<T> getAll();
}