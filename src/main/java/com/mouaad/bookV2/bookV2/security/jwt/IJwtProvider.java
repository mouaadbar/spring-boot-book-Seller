package com.mouaad.bookV2.bookV2.security.jwt;

import com.mouaad.bookV2.bookV2.security.UserPrincipal;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author sa
 * @date 3.07.2021
 * @time 19:15
 */
public interface IJwtProvider
{
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
