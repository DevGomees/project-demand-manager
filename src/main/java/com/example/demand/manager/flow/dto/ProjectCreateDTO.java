package com.example.demand.manager.flow.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ProjectCreateDTO {
    @NotBlank(message = "O nome do projeto é obrigatório")
    @Size(min = 3, max = 100, message = "O nome do projeto deve ter entre 3 e 100 caracteres")
    private String name;

    private String description;
    private Date startDate;
    private Date endDate;

    public ProjectCreateDTO() {}

    public ProjectCreateDTO(String name, String description, Date startDate, Date endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
