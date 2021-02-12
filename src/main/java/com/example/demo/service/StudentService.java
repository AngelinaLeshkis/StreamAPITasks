package com.example.demo.service;

import com.example.demo.pojo.Student;

import java.util.List;

public interface StudentService {

    List<Student> createStudents();

    Double getAverage(List<Student> students, String subject);
}
