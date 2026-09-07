package com.shubham.portfolio.service.impl;

import com.shubham.portfolio.dto.request.LoginRequest;
import com.shubham.portfolio.dto.response.LoginResponse;
import com.shubham.portfolio.security.CustomUserDetailsService;
import com.shubham.portfolio.security.JwtService;
import com.shubham.portfolio.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final CustomUserDetailsService userDetailsService;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    @Override
    public LoginResponse login(LoginRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());

        String token = jwtService.generateToken(userDetails);

        return LoginResponse.builder()
                .token(token)
                .type("Bearer")
                .message("Login Successful")
                .build();
    }
}