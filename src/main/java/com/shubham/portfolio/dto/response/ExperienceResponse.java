package com.shubham.portfolio.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ExperienceResponse {

    private Long id;

    private String company;

    private String designation;

    private String employmentType;

    private String location;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean currentlyWorking;

    private String description;

    private String technologies;
}