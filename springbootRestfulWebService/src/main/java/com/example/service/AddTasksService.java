package com.example.service;

import com.example.entity.AddTasks;
import com.example.entity.AddTasksDTO;

import java.util.List;

public interface AddTasksService {
    AddTasksDTO createAddTasks(AddTasksDTO addTasksDTO);

    static AddTasks getAddTaskById(Long TaskId) {
        return null;
    }

    List<AddTasks> getAllTasks();
//
//    AddTasks updateAddTasks(AddTasks addTasks);
//
//    void deleteTasks(Long TaskId);
//
//    AddTasks getTaskById(Long taskId);
}
