package com.spring.aop.service;

import java.util.List;

import com.spring.aop.entry.User;


public interface LoginService {
    void login();
    void login2();
    List<User> findUser();
}
