package com.kiao.authservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiao.authservice.dto.AuthResponse;
import com.kiao.authservice.dto.LoginRequest;
import com.kiao.authservice.dto.RegisterRequest;
import com.kiao.authservice.service.AuthService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping("/api/v1/auth/")
@AllArgsConstructor 
public class AuthController {

    private final AuthService authService;
    @PostMapping("login")
    public ResponseEntity<AuthResponse> login(@RequestBody  LoginRequest loginRequest) {
        return ResponseEntity.ok(authService.login(loginRequest));
    }
   

    @PostMapping("register")
    public ResponseEntity<AuthResponse> register(@RequestBody  RegisterRequest registerRequest) {
        return ResponseEntity.ok(authService.register(registerRequest));
    }
}
