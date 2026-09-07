package com.shubham.portfolio.controller.auth;

import com.shubham.portfolio.dto.request.LoginRequest;
import com.shubham.portfolio.dto.response.LoginResponse;
import com.shubham.portfolio.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {

        return authenticationService.login(request);

    }
}