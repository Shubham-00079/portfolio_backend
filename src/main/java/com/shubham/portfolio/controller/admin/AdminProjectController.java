package com.shubham.portfolio.controller.admin;

import com.shubham.portfolio.dto.request.ProjectRequest;
import com.shubham.portfolio.dto.response.ProjectResponse;
import com.shubham.portfolio.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/projects")
@RequiredArgsConstructor
public class AdminProjectController {

    private final ProjectService projectService;

    @PostMapping
    public ProjectResponse save(@Valid @RequestBody ProjectRequest request) {
        return projectService.save(request);
    }

    @GetMapping
    public List<ProjectResponse> getAll() {
        return projectService.getAll();
    }

    @PutMapping("/{id}")
    public ProjectResponse update(
            @PathVariable Long id,
            @Valid @RequestBody ProjectRequest request) {

        return projectService.update(id, request);
    }
    @GetMapping("/{id}")
    public ProjectResponse getById(@PathVariable Long id) {
        return projectService.getById(id);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectService.delete(id);
    }
}