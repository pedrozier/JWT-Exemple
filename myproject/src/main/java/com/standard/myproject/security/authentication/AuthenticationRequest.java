package com.standard.myproject.security.authentication;

import jakarta.validation.constraints.NotEmpty;

public class AuthenticationRequest {

    @NotEmpty(message = "email cannot be null")
    private String email;

    @NotEmpty(message = "password cannot be null")
    private String password;

    public AuthenticationRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(AuthenticationRequestBuilder authenticationRequestBuilder) {
        this.email = authenticationRequestBuilder.email;
        this.password = authenticationRequestBuilder.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                " email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                "}";
    }

    public AuthenticationRequestBuilder builder() {
        return new AuthenticationRequestBuilder();
    }

    public static class AuthenticationRequestBuilder {

        private String email;

        private String password;

        public AuthenticationRequestBuilder() {

        }

        public AuthenticationRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AuthenticationRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public AuthenticationRequest build() {
            return new AuthenticationRequest(this);
        }

    }

}
