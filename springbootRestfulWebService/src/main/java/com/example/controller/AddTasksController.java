package com.example.controller;

import lombok.AllArgsConstructor;
import com.example.entity.AddTasks;
import com.example.entity.AddTasksDTO;
import com.example.service.AddTasksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")

public class AddTasksController {

    private AddTasksService addTasksService;


    @RequestMapping(value = "/addTasks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Boolean> createAddTasks(@RequestBody AddTasksDTO addTasksDTO){

        AddTasksDTO savedTasks = addTasksService.createAddTasks(addTasksDTO);
       return new ResponseEntity<>(true, HttpStatus.OK);

    }

//    @GetMapping("{TaskId}")
//    public ResponseEntity<AddTasks> getTaskById(@PathVariable("TaskId") Long TaskId){
//        AddTasks addTasks = addTasksService.getTaskById(TaskId);
//        return new ResponseEntity<>(addTasks, HttpStatus.OK);
//    }
//
//    @DeleteMapping("{TaskId}")
//    public ResponseEntity<String> deleteTask(@PathVariable("id") Long TaskId){
//        addTasksService.deleteTasks(TaskId);
//        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
//    }
}
