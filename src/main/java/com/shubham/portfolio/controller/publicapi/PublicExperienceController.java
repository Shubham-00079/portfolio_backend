package com.shubham.portfolio.controller.publicapi;

import com.shubham.portfolio.dto.response.ExperienceResponse;
import com.shubham.portfolio.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public/experience")
@RequiredArgsConstructor
public class PublicExperienceController {

    private final ExperienceService experienceService;

    @GetMapping
    public List<ExperienceResponse> getAll() {
        return experienceService.getAll();
    }
}