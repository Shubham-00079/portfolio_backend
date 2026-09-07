package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.SkillRequest;
import com.shubham.portfolio.dto.response.SkillResponse;
import com.shubham.portfolio.entity.Skill;
import com.shubham.portfolio.repository.SkillRepository;
import com.shubham.portfolio.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    @Override
    public SkillResponse saveSkill(SkillRequest request) {

        Skill skill = Skill.builder()
                .name(request.getName())
                .percentage(request.getPercentage())
                .icon(request.getIcon())
                .category(request.getCategory())
                .build();

        skill = skillRepository.save(skill);

        return mapToResponse(skill);
    }

    @Override
    public List<SkillResponse> getAllSkills() {

        return skillRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    public SkillResponse updateSkill(Long id, SkillRequest request) {

        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Skill not found"));

        skill.setName(request.getName());
        skill.setPercentage(request.getPercentage());
        skill.setIcon(request.getIcon());
        skill.setCategory(request.getCategory());

        skill = skillRepository.save(skill);

        return mapToResponse(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    private SkillResponse mapToResponse(Skill skill) {

        return SkillResponse.builder()
                .id(skill.getId())
                .name(skill.getName())
                .percentage(skill.getPercentage())
                .icon(skill.getIcon())
                .category(skill.getCategory())
                .build();
    }

}