package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.EducationRequest;
import com.shubham.portfolio.dto.response.EducationResponse;

import java.util.List;

public interface EducationService {

    EducationResponse save(EducationRequest request);

    List<EducationResponse> getAll();

    EducationResponse update(Long id, EducationRequest request);

    void delete(Long id);
}