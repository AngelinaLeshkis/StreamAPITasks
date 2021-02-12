package com.example.demo.service;

import com.example.demo.dto.TaskDTO;
import com.example.demo.pojo.Task;

import java.util.List;

public interface TaskService {

    List<Task> createTask();

    String getUpdatedTasks(List<Task> tasks);

    List<TaskDTO> convertTaskToTaskDTO(List<Task> tasks);
}
