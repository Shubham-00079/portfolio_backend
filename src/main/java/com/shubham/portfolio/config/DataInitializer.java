package com.shubham.portfolio.config;

import com.shubham.portfolio.service.RoleService;
import com.shubham.portfolio.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleService roleService;
    private final UserService userService;

    @Override
    public void run(String... args) {

        roleService.initializeRoles();

        userService.createDefaultAdmin();

    }
}