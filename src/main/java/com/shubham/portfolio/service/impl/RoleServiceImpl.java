package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.entity.Role;
import com.shubham.portfolio.enums.RoleName;
import com.shubham.portfolio.repository.RoleRepository;
import com.shubham.portfolio.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role findByName(RoleName roleName) {
        return roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @Override
    public void initializeRoles() {
        if (roleRepository.findByName(RoleName.ROLE_ADMIN).isEmpty()) {
            roleRepository.save(
                    Role.builder()
                            .name(RoleName.ROLE_ADMIN)
                            .build()
            );
        }

        if (roleRepository.findByName(RoleName.ROLE_USER).isEmpty()) {
            roleRepository.save(
                    Role.builder()
                            .name(RoleName.ROLE_USER)
                            .build()
            );
        }
    }
}