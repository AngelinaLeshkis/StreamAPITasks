package com.example.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Student {

    private Map<String, Integer> rating;
    private String name;

    public Student(String name) {
        rating = new HashMap<>();
        this.name = name;
    }

    public Student rate(String subject, Integer rate) {
        rating.put(subject, rate);
        return this;
    }

}
