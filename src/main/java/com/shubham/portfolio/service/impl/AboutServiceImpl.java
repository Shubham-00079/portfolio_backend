package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.AboutRequest;
import com.shubham.portfolio.dto.response.AboutResponse;
import com.shubham.portfolio.entity.About;
import com.shubham.portfolio.repository.AboutRepository;
import com.shubham.portfolio.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {

    private final AboutRepository aboutRepository;

    @Override
    public AboutResponse saveAbout(AboutRequest request) {

        About about = About.builder()
                .fullName(request.getFullName())
                .title(request.getTitle())
                .summary(request.getSummary())
                .email(request.getEmail())
                .phone(request.getPhone())
                .location(request.getLocation())
                .githubUrl(request.getGithubUrl())
                .linkedinUrl(request.getLinkedinUrl())
                .profileImage(request.getProfileImage())
                .resumeUrl(request.getResumeUrl())
                .build();

        about = aboutRepository.save(about);

        return mapToResponse(about);
    }

    @Override
    public AboutResponse getAbout() {

        About about = aboutRepository.findAll()
                .stream()
                .findFirst()
                .orElseThrow(() -> new RuntimeException("About details not found"));

        return mapToResponse(about);
    }

    @Override
    public AboutResponse updateAbout(Long id, AboutRequest request) {

        About about = aboutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("About not found"));

        about.setFullName(request.getFullName());
        about.setTitle(request.getTitle());
        about.setSummary(request.getSummary());
        about.setEmail(request.getEmail());
        about.setPhone(request.getPhone());
        about.setLocation(request.getLocation());
        about.setGithubUrl(request.getGithubUrl());
        about.setLinkedinUrl(request.getLinkedinUrl());
        about.setProfileImage(request.getProfileImage());
        about.setResumeUrl(request.getResumeUrl());

        about = aboutRepository.save(about);

        return mapToResponse(about);
    }

    @Override
    public void deleteAbout(Long id) {

        aboutRepository.deleteById(id);
    }

    private AboutResponse mapToResponse(About about) {

        return AboutResponse.builder()
                .id(about.getId())
                .fullName(about.getFullName())
                .title(about.getTitle())
                .summary(about.getSummary())
                .email(about.getEmail())
                .phone(about.getPhone())
                .location(about.getLocation())
                .githubUrl(about.getGithubUrl())
                .linkedinUrl(about.getLinkedinUrl())
                .profileImage(about.getProfileImage())
                .resumeUrl(about.getResumeUrl())
                .build();
    }
}