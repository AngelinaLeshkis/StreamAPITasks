package com.example.demo.dto;

import com.example.demo.pojo.Task;
import com.example.demo.pojo.TaskType;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class TaskDTO {

    private Long id;
    private String title;
    private TaskType type;
    private LocalDate createdOn;
    private Set<String> tags = new HashSet<>();

    public static TaskDTO fromTask(Task task) {
        TaskDTO taskDTO = new TaskDTO();

        taskDTO.setId(task.getId());
        taskDTO.setTitle(task.getTitle());
        taskDTO.setType(task.getType());
        taskDTO.setCreatedOn(task.getCreatedOn());
        taskDTO.setTags(task.getTags());

        return taskDTO;
    }

}
