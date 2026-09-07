package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.ProjectRequest;
import com.shubham.portfolio.dto.response.ProjectResponse;
import com.shubham.portfolio.entity.Project;
import com.shubham.portfolio.repository.ProjectRepository;
import com.shubham.portfolio.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository repository;

    @Override
    public ProjectResponse save(ProjectRequest request) {

        Project project = Project.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .technology(request.getTechnology())
                .githubUrl(request.getGithubUrl())
                .liveUrl(request.getLiveUrl())
                .imageUrl(request.getImageUrl())
                .featured(request.getFeatured())
                .build();

        project = repository.save(project);

        return mapToResponse(project);
    }

    @Override
    public List<ProjectResponse> getAll() {

        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public List<ProjectResponse> getFeatured() {

        return repository.findByFeaturedTrue()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public ProjectResponse update(Long id, ProjectRequest request) {

        Project project = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        project.setTitle(request.getTitle());
        project.setDescription(request.getDescription());
        project.setTechnology(request.getTechnology());
        project.setGithubUrl(request.getGithubUrl());
        project.setLiveUrl(request.getLiveUrl());
        project.setImageUrl(request.getImageUrl());
        project.setFeatured(request.getFeatured());

        project = repository.save(project);

        return mapToResponse(project);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


    @Override
    public ProjectResponse getById(Long id) {

        Project project = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));

        return mapToResponse(project);
    }

    private ProjectResponse mapToResponse(Project project) {

        return ProjectResponse.builder()
                .id(project.getId())
                .title(project.getTitle())
                .description(project.getDescription())
                .technology(project.getTechnology())
                .githubUrl(project.getGithubUrl())
                .liveUrl(project.getLiveUrl())
                .imageUrl(project.getImageUrl())
                .featured(project.getFeatured())
                .build();
    }
}