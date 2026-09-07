package com.shubham.portfolio.repository;

import com.shubham.portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}