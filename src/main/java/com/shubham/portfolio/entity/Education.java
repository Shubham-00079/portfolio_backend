package com.shubham.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "education")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String degree;

    @Column(nullable = false)
    private String institution;

    private String fieldOfStudy;

    private Integer startYear;

    private Integer endYear;

    private String grade;

    @Column(length = 3000)
    private String description;
}