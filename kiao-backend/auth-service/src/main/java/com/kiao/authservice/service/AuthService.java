package com.kiao.authservice.service;

import com.kiao.authservice.dto.AuthResponse;
import com.kiao.authservice.dto.LoginRequest;
import com.kiao.authservice.dto.RegisterRequest;

public interface AuthService {
   public AuthResponse login(LoginRequest loginRequest); 
   public AuthResponse register(RegisterRequest registerRequest);
} 