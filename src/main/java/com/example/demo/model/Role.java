package com.example.demo.model;

public enum Role {
    ADMIN("Admin"),
    DEVELOPER("Developer"),
    ANALYST("Analyst");

    private String role;

    Role(String role) {
        this.role = role;
    }
}