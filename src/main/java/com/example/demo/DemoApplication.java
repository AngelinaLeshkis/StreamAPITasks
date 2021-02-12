package com.example.demo;

import com.example.demo.service.StudentService;
import com.example.demo.service.TaskService;
import com.example.demo.serviceimpl.StudentServiceImpl;
import com.example.demo.serviceimpl.TaskServiceImpl;

public class DemoApplication {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        TaskService taskService = new TaskServiceImpl();

        System.out.println(studentService.getAverage(studentService.createStudents(), "Chemistry"));
        System.out.println(taskService.getUpdatedTasks(taskService.createTask()));
        System.out.println(taskService.convertTaskToTaskDTO(taskService.createTask()));

    }

}
