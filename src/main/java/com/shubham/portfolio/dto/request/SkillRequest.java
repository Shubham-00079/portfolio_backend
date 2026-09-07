package com.shubham.portfolio.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SkillRequest {

    @NotBlank
    private String name;

    @Min(0)
    @Max(100)
    private Integer percentage;

    private String icon;

    private String category;
}