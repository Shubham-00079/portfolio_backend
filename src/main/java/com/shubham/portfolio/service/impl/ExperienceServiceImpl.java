package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.ExperienceRequest;
import com.shubham.portfolio.dto.response.ExperienceResponse;
import com.shubham.portfolio.entity.Experience;
import com.shubham.portfolio.repository.ExperienceRepository;
import com.shubham.portfolio.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository repository;

    @Override
    public ExperienceResponse save(ExperienceRequest request) {

        Experience experience = Experience.builder()
                .company(request.getCompany())
                .designation(request.getDesignation())
                .employmentType(request.getEmploymentType())
                .location(request.getLocation())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .currentlyWorking(request.getCurrentlyWorking())
                .description(request.getDescription())
                .technologies(request.getTechnologies())
                .build();

        experience = repository.save(experience);

        return mapToResponse(experience);
    }

    @Override
    public List<ExperienceResponse> getAll() {

        return repository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public ExperienceResponse update(Long id, ExperienceRequest request) {

        Experience experience = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Experience not found"));

        experience.setCompany(request.getCompany());
        experience.setDesignation(request.getDesignation());
        experience.setEmploymentType(request.getEmploymentType());
        experience.setLocation(request.getLocation());
        experience.setStartDate(request.getStartDate());
        experience.setEndDate(request.getEndDate());
        experience.setCurrentlyWorking(request.getCurrentlyWorking());
        experience.setDescription(request.getDescription());
        experience.setTechnologies(request.getTechnologies());

        experience = repository.save(experience);

        return mapToResponse(experience);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private ExperienceResponse mapToResponse(Experience experience) {

        return ExperienceResponse.builder()
                .id(experience.getId())
                .company(experience.getCompany())
                .designation(experience.getDesignation())
                .employmentType(experience.getEmploymentType())
                .location(experience.getLocation())
                .startDate(experience.getStartDate())
                .endDate(experience.getEndDate())
                .currentlyWorking(experience.getCurrentlyWorking())
                .description(experience.getDescription())
                .technologies(experience.getTechnologies())
                .build();
    }
}