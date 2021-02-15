package com.example.demo.service;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Subject;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<Student> createStudents();

    Double getAverage(List<Student> students, Subject subject);

}
