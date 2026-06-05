package edu.iCET.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        // Verify email/password from database

        return jwtUtil.generateToken(request.getEmail());
    }

}
