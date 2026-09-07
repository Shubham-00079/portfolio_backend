package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.ExperienceRequest;
import com.shubham.portfolio.dto.response.ExperienceResponse;

import java.util.List;

public interface ExperienceService {

    ExperienceResponse save(ExperienceRequest request);

    List<ExperienceResponse> getAll();

    ExperienceResponse update(Long id, ExperienceRequest request);

    void delete(Long id);
}