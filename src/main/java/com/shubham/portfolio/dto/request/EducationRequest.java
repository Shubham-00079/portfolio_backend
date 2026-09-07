package com.shubham.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EducationRequest {

    @NotBlank
    private String degree;

    @NotBlank
    private String institution;

    private String fieldOfStudy;

    private Integer startYear;

    private Integer endYear;

    private String grade;

    private String description;
}