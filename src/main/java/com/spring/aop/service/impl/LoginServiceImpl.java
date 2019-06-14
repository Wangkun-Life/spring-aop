package com.spring.aop.service.impl;

import com.spring.aop.entry.User;
import com.spring.aop.mapper.UserMapper;
import com.spring.aop.service.LoginService;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {
	
	private static Logger logger =  LoggerFactory.getLogger(LoginServiceImpl.class);
	@Autowired
	private UserMapper userMapper;
	
	
    @Override
    public void login() {
        System.out.println("访问到了实现类......");
    }

    @Override
    public void login2() {
        System.out.println("访问到了实现类2......");
    }

	@Override
	public List<User> findUser() {
		List<User> uList = null;
		try {
			uList = userMapper.findUser();
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("查询用户出现异常 : "+e);
		}
		return uList;
	}
}
