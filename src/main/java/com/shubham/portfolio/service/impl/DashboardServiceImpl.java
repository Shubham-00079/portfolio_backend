package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.response.DashboardResponse;
import com.shubham.portfolio.repository.EducationRepository;
import com.shubham.portfolio.repository.ExperienceRepository;
import com.shubham.portfolio.repository.ProjectRepository;
import com.shubham.portfolio.repository.SkillRepository;
import com.shubham.portfolio.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {

    private final SkillRepository skillRepository;
    private final ProjectRepository projectRepository;
    private final ExperienceRepository experienceRepository;
    private final EducationRepository educationRepository;

    @Override
    public DashboardResponse getDashboard() {

        return DashboardResponse.builder()
                .totalSkills(skillRepository.count())
                .totalProjects(projectRepository.count())
                .totalExperience(experienceRepository.count())
                .totalEducation(educationRepository.count())
                .totalCertificates(0)
                .totalMessages(0)
                .build();
    }
}