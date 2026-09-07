package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.ProjectRequest;
import com.shubham.portfolio.dto.response.ProjectResponse;

import java.util.List;

public interface ProjectService {

    ProjectResponse save(ProjectRequest request);

    List<ProjectResponse> getAll();

    List<ProjectResponse> getFeatured();

    ProjectResponse update(Long id, ProjectRequest request);

    void delete(Long id);

    ProjectResponse getById(Long id);
}