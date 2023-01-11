package com.standard.myproject.security.authentication;

import jakarta.validation.constraints.NotEmpty;

public class RegisterRequest {

    @NotEmpty(message = "firstName cannot be null")
    private String firstName;

    @NotEmpty(message = "lastName cannot be null")
    private String lastName;

    @NotEmpty(message = "email cannot be null")
    private String email;

    @NotEmpty(message = "password cannot be null")
    private String password;

    public RegisterRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public RegisterRequest() {
    }

    public RegisterRequest(RegisterRequestBuilder registerRequestBuilder) {
        this.firstName = registerRequestBuilder.firstName;
        this.lastName = registerRequestBuilder.lastName;
        this.email = registerRequestBuilder.email;
        this.password = registerRequestBuilder.password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                " firstName='" + getFirstName() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                "}";
    }

    public static class RegisterRequestBuilder {

        private String firstName;

        private String lastName;

        private String email;

        private String password;

        public RegisterRequestBuilder() {

        }

        public RegisterRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegisterRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegisterRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public RegisterRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegisterRequest build() {
            return new RegisterRequest(this);
        }

    }

}
