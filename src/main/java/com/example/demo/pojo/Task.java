package com.example.demo.pojo;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Task implements Comparable<Task> {

    private Long id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueTo;

    public Task(String title, TaskType type, LocalDate createdOn) {
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
    }

    @Override
    public int compareTo(Task other) {
        if (getCreatedOn() == null || other.getCreatedOn() == null) {
            return 0;
        }
        return getCreatedOn().compareTo(other.getCreatedOn());
    }

    public Task addTag(String tag) {
        getTags().add(tag);
        return this;
    }
}

