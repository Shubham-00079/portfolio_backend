package com.shubham.portfolio.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExperienceRequest {

    @NotBlank
    private String company;

    @NotBlank
    private String designation;

    private String employmentType;

    private String location;

    private LocalDate startDate;

    private LocalDate endDate;

    private Boolean currentlyWorking;

    private String description;

    private String technologies;
}