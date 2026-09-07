package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.entity.User;
import com.shubham.portfolio.enums.RoleName;
import com.shubham.portfolio.repository.UserRepository;
import com.shubham.portfolio.service.RoleService;
import com.shubham.portfolio.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createDefaultAdmin() {

        if (userRepository.existsByEmail("admin@portfolio.com")) {
            return;
        }

        User admin = User.builder()
                .firstName("Shubham")
                .lastName("Kumar")
                .email("admin@portfolio.com")
                .password(passwordEncoder.encode("Admin@123"))
                .phone("9876543210")
                .enabled(true)
                .role(roleService.findByName(RoleName.ROLE_ADMIN))
                .build();

        userRepository.save(admin);
    }
}