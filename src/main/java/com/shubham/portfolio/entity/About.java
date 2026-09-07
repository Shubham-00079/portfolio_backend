package com.shubham.portfolio.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "about")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String title;

    @Column(length = 3000)
    private String summary;

    private String email;

    private String phone;

    private String location;

    private String githubUrl;

    private String linkedinUrl;

    private String profileImage;

    private String resumeUrl;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}