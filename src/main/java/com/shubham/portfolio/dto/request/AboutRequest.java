package com.shubham.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AboutRequest {

    @NotBlank
    private String fullName;

    @NotBlank
    private String title;

    private String summary;

    private String email;

    private String phone;

    private String location;

    private String githubUrl;

    private String linkedinUrl;

    private String profileImage;

    private String resumeUrl;
}