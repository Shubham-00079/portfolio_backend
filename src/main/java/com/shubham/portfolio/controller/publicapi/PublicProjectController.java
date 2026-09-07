package com.shubham.portfolio.controller.publicapi;

import com.shubham.portfolio.dto.response.ProjectResponse;
import com.shubham.portfolio.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public/projects")
@RequiredArgsConstructor
public class PublicProjectController {

    private final ProjectService projectService;

    @GetMapping
    public List<ProjectResponse> getAll() {
        return projectService.getAll();
    }
    @GetMapping("/{id}")
    public ProjectResponse getById(@PathVariable Long id) {
        return projectService.getById(id);
    }


    @GetMapping("/featured")
    public List<ProjectResponse> getFeatured() {
        return projectService.getFeatured();
    }
}