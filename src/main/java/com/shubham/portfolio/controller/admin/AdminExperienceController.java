package com.shubham.portfolio.controller.admin;

import com.shubham.portfolio.dto.request.ExperienceRequest;
import com.shubham.portfolio.dto.response.ExperienceResponse;
import com.shubham.portfolio.service.ExperienceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/experience")
@RequiredArgsConstructor
public class AdminExperienceController {

    private final ExperienceService experienceService;

    @PostMapping
    public ExperienceResponse save(@Valid @RequestBody ExperienceRequest request) {
        return experienceService.save(request);
    }

    @GetMapping
    public List<ExperienceResponse> getAll() {
        return experienceService.getAll();
    }

    @PutMapping("/{id}")
    public ExperienceResponse update(
            @PathVariable Long id,
            @Valid @RequestBody ExperienceRequest request) {
        return experienceService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        experienceService.delete(id);
    }
}