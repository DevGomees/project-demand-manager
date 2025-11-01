package com.example.demand.manager.flow.repositories;

import com.example.demand.manager.flow.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository  extends JpaRepository<Project, Long> {
    Project findByName(String name);
}
