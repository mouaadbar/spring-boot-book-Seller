package com.mouaad.bookV2.bookV2.service;


import com.mouaad.bookV2.bookV2.model.User;

/**
 * @author sa
 * @date 3.07.2021
 * @time 19:40
 */
public interface IAuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
