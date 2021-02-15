package com.example.demo.serviceimpl;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Subject;
import com.example.demo.service.StudentService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> createStudents() {
        Student student = new Student("Alex");
        student.rate(Subject.MATH, 10);
        student.rate(Subject.CHEMISTRY, 8);
        Student student1 = new Student("Sam");
        student1.rate(Subject.MATH, 3);
        student1.rate(Subject.CHEMISTRY, 6);
        Student student2 = new Student("Nick");
        student2.rate(Subject.CHEMISTRY, 2);

        return Arrays.asList(student, student1, student2);
    }

    @Override
    public Double getAverage(List<Student> students, Subject subject) {
        return students.stream()
                .filter(student -> nonNull(getSubjectRating(subject, student)))
                .mapToDouble(student -> getSubjectRating(subject, student))
                .average()
                .orElseThrow(() -> new RuntimeException("There are not rating for this subject"));
    }

    private Integer getSubjectRating(Subject subject, Student student) {
        return student.getRating().get(subject);
    }

    @Override
    public void getStudentsMarksBySubject(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(Student::getSubjects))
                .entrySet().forEach(System.out::println);
    }
}
