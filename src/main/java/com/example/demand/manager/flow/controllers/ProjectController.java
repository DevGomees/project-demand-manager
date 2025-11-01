package com.example.demand.manager.flow.controllers;


import com.example.demand.manager.flow.dto.ProjectCreateDTO;
import com.example.demand.manager.flow.dto.ProjectResponseDTO;
import com.example.demand.manager.flow.services.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ResponseEntity<ProjectResponseDTO> create(@Valid @RequestBody ProjectCreateDTO dto) {
        ProjectResponseDTO result = projectService.create(dto);
        URI location = URI.create("/project/" + result.getId());
        return ResponseEntity.created(location).body(result);
    }
}
