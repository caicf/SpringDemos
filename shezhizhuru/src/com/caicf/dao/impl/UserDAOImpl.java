package com.caicf.dao.impl;

import com.caicf.dao.UserDAO;
import com.caicf.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println("============================");
		System.out.println(user.getUsername()+"-"+user.getPassword());
		System.out.println("============================");
	}

}
