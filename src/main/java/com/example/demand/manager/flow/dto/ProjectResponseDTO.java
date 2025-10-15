package com.example.demand.manager.flow.dto;

import com.example.demand.manager.flow.entities.Project;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ProjectResponseDTO {
    private Long id;
    private String name;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<TaskResponseDTO> tasks;

    public ProjectResponseDTO() {}

    public ProjectResponseDTO(Long id, String name, String description, Date startDate, Date endDate, List<TaskResponseDTO> tasks) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tasks = tasks;
    }

    public ProjectResponseDTO(Project project) {
    }
    public static ProjectResponseDTO safeView(Project project){
        ProjectResponseDTO dto = new ProjectResponseDTO();
        BeanUtils.copyProperties(project, dto);
        return dto;
    }
}
