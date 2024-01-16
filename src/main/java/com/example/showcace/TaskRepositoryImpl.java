package com.example.showcace;



import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
@Repository
public class TaskRepositoryImpl implements TaskRepository {
    private final List<Task> tasks = new LinkedList<>(){{
        add(new Task("Task 1"));
        add(new Task("Task 2"));
        add(new Task("Task 3"));
    }};
    @Override
    public List<Task> findAll() {
        return null;
    }
}
