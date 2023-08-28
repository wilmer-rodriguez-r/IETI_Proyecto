package com.example.demo.service;

import com.example.demo.model.User;

public interface UserServiceInterface {

    void createUser(User user);

    User getUser(String userId);

    void updateUser(String userId,User user);

    void deleteUser(String userId);
}
