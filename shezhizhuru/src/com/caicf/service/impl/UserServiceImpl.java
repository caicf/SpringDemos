package com.caicf.service.impl;

import com.caicf.dao.UserDAO;
import com.caicf.model.User;
import com.caicf.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDAO.save(user);
	}
	
	

}
