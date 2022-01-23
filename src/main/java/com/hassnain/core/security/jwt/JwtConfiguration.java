package com.hassnain.core.security.jwt;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application.jwt")
public class JwtConfiguration {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationDay;


    public JwtConfiguration() {
        super();
    }
    public String getSecretKey() {
        return secretKey;
    }
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    public String getTokenPrefix() {
        return tokenPrefix;
    }
    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }
    public Integer getTokenExpirationDay() {
        return tokenExpirationDay;
    }
    public void setTokenExpirationDay(Integer tokenExpirationDay) {
        this.tokenExpirationDay = tokenExpirationDay;
    }

    public String getAuthorizationHeader() {
        return HttpHeaders.AUTHORIZATION;
    }
}
