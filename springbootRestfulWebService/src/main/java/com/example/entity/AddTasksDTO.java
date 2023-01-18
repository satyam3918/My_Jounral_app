package com.example.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddTasksDTO {
    private String TaskName;
    private String TaskDescription;
    private String TaskDate;
    private String CreatedBy;
    private String CreatedTS;
    private String UpdatedBy;
    private String UpdatedTS;
}
