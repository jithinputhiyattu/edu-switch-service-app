package com.edu.service.controller;

import generated.api.AccountApi;
import generated.model.SignInRequest;
import generated.model.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController implements AccountApi {

    @Override
    public ResponseEntity<Void> signIn(@Valid SignInRequest signInRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Void> signUp(@Valid SignUpRequest signUpRequest) {
        return null;
    }
}
