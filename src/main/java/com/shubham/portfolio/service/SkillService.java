package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.SkillRequest;
import com.shubham.portfolio.dto.response.SkillResponse;

import java.util.List;

public interface SkillService {

    SkillResponse saveSkill(SkillRequest request);

    List<SkillResponse> getAllSkills();

    SkillResponse updateSkill(Long id, SkillRequest request);

    void deleteSkill(Long id);
}