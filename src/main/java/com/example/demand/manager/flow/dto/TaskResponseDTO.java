package com.example.demand.manager.flow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponseDTO {
    private Long id;
    private String title;
    private String description;
    private Enum status;
    private Enum priority;

    public TaskResponseDTO() {}

    public TaskResponseDTO(Long id, String title, String description, Enum status, Enum priority) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

}
