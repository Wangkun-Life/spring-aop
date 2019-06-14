package com.spring.aop.mapper;

import java.util.List;

import com.spring.aop.entry.User;



public interface UserMapper {

    public void addUser(User user);
    
    public User fandOen(String id);

	public List<User> findUser();
}
