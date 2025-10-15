package com.example.demand.manager.flow.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskCreateDTO {
    @NotBlank(message = "O nome da tarefa é obrigatório")
    private String title;

    private String description;
    private Enum status;
    private Enum priority;
    private String dueDate;
    private Long projectId;

    public TaskCreateDTO() {}
    public TaskCreateDTO(String title, String description, Enum status, Enum priority, String dueDate, Long projectId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
        this.projectId = projectId;
    }
}
