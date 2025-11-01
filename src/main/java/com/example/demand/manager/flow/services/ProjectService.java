package com.example.demand.manager.flow.services;

import com.example.demand.manager.flow.dto.ProjectCreateDTO;
import com.example.demand.manager.flow.exceptions.ResourceNotFoundException;
import com.example.demand.manager.flow.dto.ProjectResponseDTO;
import com.example.demand.manager.flow.entities.Project;
import com.example.demand.manager.flow.repositories.ProjectRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Transactional(readOnly = true)
    public ProjectResponseDTO findByid(long id){
        Project result = projectRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Project not found with id: " + id));
        return new ProjectResponseDTO(result);
    }

    @Transactional(readOnly = true)
    public List<ProjectResponseDTO> findAll(){
        List<Project> result = projectRepository.findAll();
        return result.stream().map(ProjectResponseDTO::new).toList();
    }

    @Transactional
    public ProjectResponseDTO create(@Valid ProjectCreateDTO dto) {
        if (projectRepository.findByName(dto.getName()) != null) {
            throw new DataIntegrityViolationException("Name already exists");
        }
        Project project = new Project(dto.getName(), dto.getDescription(), dto.getStartDate(), dto.getEndDate());
        projectRepository.save(project);
        return new ProjectResponseDTO(project);
    }
}
