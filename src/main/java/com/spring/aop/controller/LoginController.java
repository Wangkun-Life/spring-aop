package com.spring.aop.controller;

import com.spring.aop.entry.User;
import com.spring.aop.service.LoginService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	@RequestMapping("/login")
	public void login() {
		System.out.println("访问到了......");
		loginService.login();
	}

	@RequestMapping("/login2")
	public void login2() {
		System.out.println("访问到了......");
		loginService.login2();
	}
	
	
	@RequestMapping("/findUser")
	public List<User> findUser() {
		return loginService.findUser();
	}
}
