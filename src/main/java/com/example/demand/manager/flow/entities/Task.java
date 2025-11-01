package com.example.demand.manager.flow.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Enum status;
    private Enum priority;
    private Date dueDate;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;



}
