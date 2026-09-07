package com.shubham.portfolio.service;

import com.shubham.portfolio.dto.request.LoginRequest;
import com.shubham.portfolio.dto.response.LoginResponse;

public interface AuthenticationService {

    LoginResponse login(LoginRequest request);

}