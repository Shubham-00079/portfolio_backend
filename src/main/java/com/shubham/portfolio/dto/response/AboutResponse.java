package com.shubham.portfolio.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AboutResponse {

    private Long id;

    private String fullName;

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