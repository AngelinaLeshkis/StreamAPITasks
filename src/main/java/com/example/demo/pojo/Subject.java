package com.example.demo.pojo;

public enum Subject {

    MATH("Math"), CHEMISTRY("Chemistry");

    private String valueOfSubject;

    Subject(String valueOfSubject) {
        this.valueOfSubject = valueOfSubject;
    }

    public String getSubject() {
        return valueOfSubject;
    }
}
