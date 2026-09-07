package com.shubham.portfolio.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SkillResponse {

    private Long id;

    private String name;

    private Integer percentage;

    private String icon;

    private String category;
}