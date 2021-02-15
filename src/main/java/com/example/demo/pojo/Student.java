package com.example.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class Student {

    private Map<Subject, Integer> rating;
    private String name;
    private List<Subject> subjects = new ArrayList<>();
    private long mark;

    public Student(String name) {
        rating = new HashMap<>();
        this.name = name;
    }

    public Student rate(Subject subject, Integer rate) {
        rating.put(subject, rate);
        subjects.add(subject);
        mark = rate;
        return this;
    }

}
