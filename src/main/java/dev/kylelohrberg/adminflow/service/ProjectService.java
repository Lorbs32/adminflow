package dev.kylelohrberg.adminflow.service;

import dev.kylelohrberg.adminflow.entity.Project;
import dev.kylelohrberg.adminflow.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id){
        return projectRepository.findById(id);
    }

    public Project createProject(Project project){
        project.setCreatedDate(LocalDate.now());
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project updatedProject){
        return projectRepository.findById(id).map(project -> {
            project.setName(updatedProject.getName());
            project.setDescription(updatedProject.getDescription());
            return projectRepository.save(project);
        }).orElseThrow(() -> new RuntimeException("Project not found"));
    }

    public void deleteProject(Long id){
        projectRepository.deleteById(id);
    }
}
