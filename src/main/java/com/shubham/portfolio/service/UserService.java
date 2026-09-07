package com.shubham.portfolio.service;

import com.shubham.portfolio.entity.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByEmail(String email);

    void createDefaultAdmin();
}