package com.creswave.test.services;

import com.creswave.test.dao.JwtAuthenticationResponse;
import com.creswave.test.dao.SignUpRequest;
import com.creswave.test.dao.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
