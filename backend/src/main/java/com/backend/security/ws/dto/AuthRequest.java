package com.backend.security.ws.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class AuthRequest {

    @Email(message = "Email format is not correct")
    private String email;
    @Size(min = 6, message = "Password should have 6 character minimum")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
