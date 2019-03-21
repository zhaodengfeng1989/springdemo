package com.zhaodf.springframework.chapter8.springJdbc.service;

import com.zhaodf.springframework.chapter8.springJdbc.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getUsers();
}
