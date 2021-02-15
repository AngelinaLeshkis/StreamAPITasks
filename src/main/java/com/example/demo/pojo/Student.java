package com.example.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
public class Student {

    private Map<Subject, Integer> rating;
    private String name;
    private Set<Subject> subjects = new HashSet<>();
    private long mark;

    public Student(String name) {
        rating = new HashMap<>();
        this.name = name;
    }

    public Student rate(Subject subject, Integer rate) {
        rating.put(subject, rate);
        subjects.add(subject);
        mark = rate;
        Subject.setSubjectSet(subject);
        return this;
    }

}
