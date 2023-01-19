package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tasks")
public class AddTasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer TaskId;
    private String TaskName;
    private String TaskDescription;
    private String TaskDate;
    private String CreatedBy;
    private String CreatedTS;
    private String UpdatedBy;
    private String UpdatedTS;
}
