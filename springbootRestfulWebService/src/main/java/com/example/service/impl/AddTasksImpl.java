package com.example.service.impl;

import com.example.entity.AddTasks;
import lombok.AllArgsConstructor;
import com.example.entity.AddTasksDTO;
import com.example.repository.AddTasksRepository;
import com.example.service.AddTasksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class AddTasksImpl implements AddTasksService {

    private AddTasksRepository addTasksRepository;

    @Override
    public AddTasksDTO createAddTasks(AddTasksDTO addTasksDTO) {
        return addTasksRepository.save(addTasksDTO);
    }

    @Override
    public List<AddTasks> getAllTasks() {
        return null;
    }

//    @Override
//    public AddTasks getTaskById(Long TaskId) {
//        Optional<AddTasks> optionalAddTasks = addTasksRepository.findById(TaskId);
//        return optionalAddTasks.get();
//    }
//
//    @Override
//    public List<AddTasks> getAllTasks() {
//        return addTasksRepository.findAll();
//    }
//
//    @Override
//    public AddTasks updateAddTasks(AddTasks addTasks) {
//        return null;
//    }
//
//    @Override
//    public void deleteTasks(Long TaskId) {
//        addTasksRepository.deleteById(TaskId);
//
//    }
}
