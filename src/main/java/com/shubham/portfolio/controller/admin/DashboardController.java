package com.shubham.portfolio.controller.admin;

import com.shubham.portfolio.dto.response.DashboardResponse;
import com.shubham.portfolio.service.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final DashboardService dashboardService;

    @GetMapping
    public DashboardResponse dashboard() {
        return dashboardService.getDashboard();
    }
}