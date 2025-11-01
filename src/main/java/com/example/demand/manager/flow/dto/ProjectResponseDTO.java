package com.example.demand.manager.flow.dto;

import com.example.demand.manager.flow.entities.Project;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class ProjectResponseDTO {
    private Long id;
    private String name;
    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate endDate;

    private List<TaskResponseDTO> tasks;

    public ProjectResponseDTO() {}

    public ProjectResponseDTO(Long id, String name, String description, LocalDate startDate, LocalDate endDate, List<TaskResponseDTO> tasks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = tasks;
    }

    public ProjectResponseDTO(Project project) {
        if (project != null) {
            BeanUtils.copyProperties(project, this);
        }
    }
    public static ProjectResponseDTO safeView(Project project){
        ProjectResponseDTO dto = new ProjectResponseDTO();
        BeanUtils.copyProperties(project, dto);
        return dto;
    }
    public static Optional<ProjectResponseDTO> safeView(Optional<Project> project){
        return project.map(ProjectResponseDTO::safeView);
    }
}
