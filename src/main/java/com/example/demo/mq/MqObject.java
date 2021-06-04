package com.example.demo.mq;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MqObject implements Serializable {

    private String fild1;
    private int fild2;

    @Override
    public String toString() {
        return "MqObject{" +
                "fild1='" + fild1 + '\'' +
                ", fild2=" + fild2 +
                '}';
    }
}