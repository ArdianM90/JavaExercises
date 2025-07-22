package com.exercise.lambdas;

public class User {
    private String name;
    private String role; // np. "ADMIN", "USER", "GUEST"
    private boolean active;

    public User(String name, String role, boolean active) {
        this.name = name;
        this.role = role;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
