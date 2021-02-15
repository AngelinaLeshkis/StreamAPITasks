package com.example.demo;

import com.example.demo.pojo.Student;
import com.example.demo.pojo.Subject;
import com.example.demo.pojo.Task;
import com.example.demo.service.StudentService;
import com.example.demo.service.TaskService;
import com.example.demo.serviceimpl.StudentServiceImpl;
import com.example.demo.serviceimpl.TaskServiceImpl;

import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        TaskService taskService = new TaskServiceImpl();
        List<Student> students = studentService.createStudents();
        List<Task> tasks = taskService.createTask();

        System.out.println(studentService.getAverage(students, Subject.CHEMISTRY));
        System.out.println(taskService.getUpdatedTasks(tasks));
        System.out.println(taskService.convertTaskToTaskDTO(tasks));
        studentService.getStudentsMarksBySubject(students);
        System.out.println(taskService.getGroupingTasks(tasks));
    }

}
