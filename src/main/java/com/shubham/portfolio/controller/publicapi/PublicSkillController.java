package com.shubham.portfolio.controller.publicapi;

import com.shubham.portfolio.dto.response.SkillResponse;
import com.shubham.portfolio.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public/skills")
@RequiredArgsConstructor
public class PublicSkillController {

    private final SkillService skillService;

    @GetMapping
    public List<SkillResponse> getAllSkills() {
        return skillService.getAllSkills();
    }
}