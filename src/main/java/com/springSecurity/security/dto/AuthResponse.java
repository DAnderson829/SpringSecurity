package com.springSecurity.security.dto;

public class AuthResponse {
    private String token;

    private AuthResponse(String token){
        this.token = token;
    }

    public String getToken(){
        return token;
    }
}
