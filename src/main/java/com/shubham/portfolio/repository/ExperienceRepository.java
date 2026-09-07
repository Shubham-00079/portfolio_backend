package com.shubham.portfolio.repository;

import com.shubham.portfolio.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository
        extends JpaRepository<Experience, Long> {
}