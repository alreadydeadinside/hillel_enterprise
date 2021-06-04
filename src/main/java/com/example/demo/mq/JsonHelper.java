package com.example.demo.mq;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonHelper {

    private static final Gson gson = new Gson();

    public static <T> T readObject(String json, Type type) {
        return (T) gson.fromJson(json, type);
    }

    public static <T> String writeObject(T object) {
        return gson.toJson(object);
    }
}