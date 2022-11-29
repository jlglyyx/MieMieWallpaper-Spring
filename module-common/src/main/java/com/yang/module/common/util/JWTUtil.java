package com.yang.module.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class JWTUtil {

    public static final String JWT_ID = UUID.randomUUID().toString();

    private static final String KEY = "keyxxx";


    public static String createToken(String userId) {
        Map<String,Object> header = new HashMap<>();
        JwtBuilder builder = Jwts.builder()
                .setHeader(header)
                .setId(JWT_ID)
                .setSubject(userId)
                .signWith(SignatureAlgorithm.HS256,KEY);
        return builder.compact();
    }

    public static Claims parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}
