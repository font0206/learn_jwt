package com.example.spring_boot_api_jwt.service;

import com.example.spring_boot_api_jwt.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
