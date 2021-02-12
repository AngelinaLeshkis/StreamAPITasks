package com.example.demo.serviceimpl;

import com.example.demo.dto.TaskDTO;
import com.example.demo.pojo.Task;
import com.example.demo.pojo.TaskType;
import com.example.demo.service.TaskService;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {

    public List<Task> createTask() {
        Task task1 = new Task("Read Version Control with Git book", TaskType.READING,
                LocalDate.of(2015, Month.JULY, 1)).addTag("git").addTag("reading").addTag("books");

        Task task2 = new Task("Read Java 8 Lambdas book", TaskType.READING,
                LocalDate.of(2015, Month.JULY, 2)).addTag("java8").addTag("reading").addTag("books");

        Task task3 = new Task("Write a mobile application to store my tasks", TaskType.CODING,
                LocalDate.of(2015, Month.JULY, 3)).addTag("coding").addTag("mobile");

        Task task4 = new Task("Write a blog on Java 8 Streams", TaskType.WRITING,
                LocalDate.of(2015, Month.JULY, 4)).addTag("blogging").addTag("writing").addTag("streams");

        Task task5 = new Task("Read Domain Driven Design book", TaskType.READING,
                LocalDate.of(2015, Month.JULY, 5)).addTag("ddd").addTag("books").addTag("reading");

        return Arrays.asList(task1, task2, task3, task4, task5);
    }

    public String getUpdatedTasks(List<Task> tasks) {
        return tasks.stream()
                .filter(task -> task.getType().equals(TaskType.READING))
                .sorted(Comparator.comparing(Task::getCreatedOn))
                .limit(5)
                .map(Task::getTitle)
                .collect(Collectors.joining(","));
    }

    @Override
    public List<TaskDTO> convertTaskToTaskDTO(List<Task> tasks) {
      return tasks.stream()
              .map(TaskDTO::fromTask)
              .collect(Collectors.toList());
    }
}
