package com.kiao.authservice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder 
@Getter 
@Setter 
public class AuthResponse { 
    private String name;
    private String gmail;
    private String token;
}
