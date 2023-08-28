package com.example.demo.model;

public class User {

    private String nameUser;
    private String userId;
    public User(String name, String userId) {
        nameUser = name;
        this.userId = userId;
    }

    public User() {}

    public String getNameUser() {
        return nameUser;
    }

    public String getUserId() {
        return userId;
    }
}
