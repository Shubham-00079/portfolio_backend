package com.shubham.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProjectRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String technology;

    private String githubUrl;

    private String liveUrl;

    private String imageUrl;

    private Boolean featured;
}