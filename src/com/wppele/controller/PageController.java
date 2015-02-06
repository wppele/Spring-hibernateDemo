package com.wppele.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wppele.entity.Users;
import com.wppele.service.UserService;

@Controller
public class PageController {
	@Autowired
	private UserService userservice;
	
	@RequestMapping("index")
	public String tohome(){
		Users users=new Users();
		users.setUserId(1);
		users.setPassword("wpp");
		users.setUserName("wppele");
		users.setRank(0);
		users.setTelPhone("18833725701");
		userservice.addUser(users);
		return "index";
	}
}
