package com.shubham.portfolio.service;

import com.shubham.portfolio.entity.Role;
import com.shubham.portfolio.enums.RoleName;

public interface RoleService {

    Role findByName(RoleName roleName);

    void initializeRoles();
}
