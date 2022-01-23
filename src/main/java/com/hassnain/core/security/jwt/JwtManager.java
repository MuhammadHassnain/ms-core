package com.hassnain.core.security.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class JwtManager {


    @Autowired JwtConfiguration jwtConfig;


    public String createToken(JwtTokenRequest jwtTokenRequest){


        SecretKey key = Keys.hmacShaKeyFor(jwtConfig.getSecretKey().getBytes());

        JwtBuilder jwtBuilder = Jwts.builder()
                .setSubject(jwtTokenRequest.getPrinciple())
                .setIssuedAt(new Date())
                .setExpiration(java.sql.Date.valueOf(LocalDate.now().plusDays(jwtConfig.getTokenExpirationDay())));

        for (Map.Entry<String, List<String>> entry :
                jwtTokenRequest.getJwtTokenPayload().entrySet()) {
            jwtBuilder = jwtBuilder.claim(entry.getKey(),entry.getValue());
        }

        String token = jwtBuilder
                .signWith(key)
                .compact();

        token = jwtConfig.getTokenPrefix()+token;
        return token;
    }
    public String parseToken(){
        return null;
    }


    public  String getRequestHeaderKey(){
        return this.jwtConfig.getAuthorizationHeader();
    }
}
