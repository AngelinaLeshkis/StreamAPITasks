package com.example.demo.pojo;

import java.util.HashSet;
import java.util.Set;

public enum Subject {

    MATH("Math"), CHEMISTRY("Chemistry");

    private String valueOfSubject;
    private static Set<Subject> subjectSet = new HashSet<>();

    Subject(String valueOfSubject) {
        this.valueOfSubject = valueOfSubject;
    }

    public String getSubject() {
        return valueOfSubject;
    }

    public static Set<Subject> getSubjectSet() {
        return subjectSet;
    }

    public static void setSubjectSet(Subject subject) {
        subjectSet.add(subject);
    }
}
