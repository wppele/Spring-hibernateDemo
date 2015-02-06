package com.wppele.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wppele.dao.UsersDAO;
import com.wppele.entity.Users;
@Service
@Transactional
public class UserService {
	@Autowired
	private UsersDAO usersdao;
	
	public List<Users> getAllUsers(){
		return usersdao.findAll();
	}
	
	@Transactional(readOnly=false)
	public void addUser(Users users) {
		usersdao.addUser(users);
	}
}
