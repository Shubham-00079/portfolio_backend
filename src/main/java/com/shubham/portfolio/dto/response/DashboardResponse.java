package com.shubham.portfolio.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DashboardResponse {

    private long totalSkills;

    private long totalProjects;

    private long totalExperience;

    private long totalEducation;

    private long totalCertificates;

    private long totalMessages;
}