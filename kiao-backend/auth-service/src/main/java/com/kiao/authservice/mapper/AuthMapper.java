package com.kiao.authservice.mapper;


import org.springframework.stereotype.Component;

import com.kiao.authservice.dto.AuthResponse;
import com.kiao.authservice.dto.RegisterRequest;
import com.kiao.authservice.model.User;

@Component 
public class AuthMapper {
    
    public User fromRegister(RegisterRequest registerRequest) {
       return  User.builder().name(registerRequest.name()).gmail(registerRequest.gmail()).password(registerRequest.password()).build(); 
    }

    public AuthResponse fromUser(User user) {
        return AuthResponse.builder().name(user.getName())
        .gmail(user.getGmail())
        .token("testing").build();
    }
}
