package com.shubham.portfolio.controller.admin;

import com.shubham.portfolio.dto.request.SkillRequest;
import com.shubham.portfolio.dto.response.SkillResponse;
import com.shubham.portfolio.service.SkillService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/skills")
@RequiredArgsConstructor
public class AdminSkillController {

    private final SkillService skillService;

    @PostMapping
    public SkillResponse save(@Valid @RequestBody SkillRequest request) {
        return skillService.saveSkill(request);
    }

    @GetMapping
    public List<SkillResponse> getAll() {
        return skillService.getAllSkills();
    }

    @PutMapping("/{id}")
    public SkillResponse update(
            @PathVariable Long id,
            @Valid @RequestBody SkillRequest request) {

        return skillService.updateSkill(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        skillService.deleteSkill(id);
    }
}