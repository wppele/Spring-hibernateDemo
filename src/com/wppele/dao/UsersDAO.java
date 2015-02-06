package com.wppele.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wppele.entity.Users;
@Repository
public class UsersDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public int addUser(Users users){
		return (Integer) sessionFactory.getCurrentSession().save(users); 
	}
	
	public List<Users> findAll(){
		Criteria criteria=sessionFactory.getCurrentSession().createCriteria(Users.class);
		return criteria.list();
	}
}
