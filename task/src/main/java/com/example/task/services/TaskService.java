package com.example.task.services;

import com.example.task.models.Task;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TaskService {
    private final Map<Long, Task> tasks = new HashMap<>();
    private long counter = 1;

    public Task createTask(Task task) {
        task.setId(counter++);
        tasks.put(task.getId(), task);
        return task;
    }

    public Task getTaskById(Long id) {
        return tasks.get(id);
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task updateTask(Long id, Task task) {
        if (tasks.containsKey(id)) {
            task.setId(id);
            tasks.put(id, task);
            return task;
        }
        return null;
    }

    public boolean deleteTask(Long id) {
        return tasks.remove(id) != null;
    }
}
