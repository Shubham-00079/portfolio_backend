package com.shubham.portfolio.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectResponse {

    private Long id;

    private String title;

    private String description;

    private String technology;

    private String githubUrl;

    private String liveUrl;

    private String imageUrl;

    private Boolean featured;
}