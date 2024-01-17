package com.example.showcace;

import java.util.List;
public interface TaskRepository {


    List<Task> findAll();

    Task save(Task task);
}
