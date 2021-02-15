package com.example.demo.service;

import com.example.demo.dto.TaskDTO;
import com.example.demo.pojo.Task;
import com.example.demo.pojo.TaskType;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface TaskService {

    List<Task> createTask();

    String getUpdatedTasks(List<Task> tasks);

    List<TaskDTO> convertTaskToTaskDTO(List<Task> tasks);

    Map<TaskType, Map<LocalDate, Map<String, Map<Set<String>, List<Task>>>>>  getGroupingTasks(List<Task> tasks);
}
