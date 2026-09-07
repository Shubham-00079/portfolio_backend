package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.EducationRequest;
import com.shubham.portfolio.dto.response.EducationResponse;
import com.shubham.portfolio.repository.EducationRepository;
import com.shubham.portfolio.service.EducationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationServiceImpl implements EducationService {

    private final EducationRepository repository;

    @Override
    public EducationResponse save(EducationRequest request) {
        return null;
    }

    @Override
    public List<EducationResponse> getAll() {
        return null;
    }

    @Override
    public EducationResponse update(Long id, EducationRequest request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}