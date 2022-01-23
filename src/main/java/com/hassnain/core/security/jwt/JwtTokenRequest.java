package com.hassnain.core.security.jwt;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Getter
public class JwtTokenRequest {


    private String principle;
    private Map<String,List<String>> jwtTokenPayload;


    public JwtTokenRequest(String principle) {
        this.principle = principle;
        this.jwtTokenPayload = new HashMap<>();
    }

    public JwtTokenRequest(String principle, Map<String, List<String>> jwtTokenPayload) {
        this.principle = principle;
        this.jwtTokenPayload = jwtTokenPayload;
    }
}
