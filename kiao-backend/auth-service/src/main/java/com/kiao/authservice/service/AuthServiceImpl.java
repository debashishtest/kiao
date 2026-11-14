package com.kiao.authservice.service;


import org.springframework.stereotype.Service;

import com.kiao.authservice.dto.AuthResponse;
import com.kiao.authservice.dto.LoginRequest;
import com.kiao.authservice.dto.RegisterRequest;
import com.kiao.authservice.mapper.AuthMapper;
import com.kiao.authservice.model.User;
import com.kiao.authservice.repisotory.AuthRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class AuthServiceImpl implements AuthService{

    private final AuthRepository authRepository;
    private  final AuthMapper authMapper;

    @Override
    public AuthResponse login(LoginRequest loginRequest) {
        User user = authRepository.findByGmail(loginRequest.gmail()).orElse(null);

        if(user == null) {
            throw new RuntimeException("User Not found");
        }

        if (user.getPassword() != loginRequest.password()) {
           throw new RuntimeException("Wrong Password"); 
        }

        return authMapper.fromUser(user);

            
    }

    @Override
    public AuthResponse register(RegisterRequest registerRequest) {
        User user = authRepository.save(authMapper.fromRegister(registerRequest));
        return authMapper.fromUser(user);
    }
    
}
