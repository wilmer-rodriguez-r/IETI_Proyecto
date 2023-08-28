package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService implements UserServiceInterface {

    private final Map<String, User> users = new HashMap<>();

    @Override
    public void createUser(User user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public User getUser(String userId) {
        return users.get(userId);
    }

    @Override
    public void updateUser(String userId, User user) {
        users.put(userId, user);
    }

    @Override
    public void deleteUser(String userId) {
        users.remove(userId);
    }
}
