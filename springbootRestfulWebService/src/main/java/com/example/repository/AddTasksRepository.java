package com.example.repository;

import com.example.entity.AddTasks;
import com.example.entity.AddTasksDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddTasksRepository extends JpaRepository<AddTasksDTO, Long> {
}
