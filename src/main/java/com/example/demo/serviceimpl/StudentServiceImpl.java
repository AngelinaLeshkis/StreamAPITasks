package com.example.demo.serviceimpl;

import com.example.demo.pojo.Student;
import com.example.demo.service.StudentService;

import javax.xml.ws.ServiceMode;
import java.util.Arrays;
import java.util.List;

import static java.util.Objects.nonNull;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> createStudents() {
        Student student = new Student("Alex");
        student.rate("Math", 10);
        student.rate("Chemistry", 8);
        Student student1 = new Student("Sam");
        student1.rate("Math", 3);
        student1.rate("Chemistry", 6);
        Student student2 = new Student("Nick");
        student2.rate("Chemistry", 2);

        return Arrays.asList(student, student1, student2);
    }
    @Override
    public Double getAverage(List<Student> students, String subject) {
        return students.stream()
                .filter(student -> nonNull(getSubjectRating(subject, student)))
                .mapToDouble(student -> getSubjectRating(subject, student))
                .average()
                .orElseThrow(() -> new RuntimeException("There are not rating for this subject"));
    }

    private Integer getSubjectRating(String subject, Student x) {
        return x.getRating().get(subject);
    }
}
