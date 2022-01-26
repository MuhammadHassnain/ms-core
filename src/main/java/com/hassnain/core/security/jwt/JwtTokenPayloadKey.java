package com.hassnain.core.security.jwt;


/*
* Use this
*
* */
public enum JwtTokenPayloadKey {

    AUTHORITIES("authorities");

    private final String key;

    JwtTokenPayloadKey(String key){
        this.key = key;
    }

    public String getKey(){
        return key;
    }
}
