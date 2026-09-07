package com.shubham.portfolio.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EducationResponse {

    private Long id;
    private String degree;
    private String institution;
    private String fieldOfStudy;
    private Integer startYear;
    private Integer endYear;
    private String grade;
    private String description;
}