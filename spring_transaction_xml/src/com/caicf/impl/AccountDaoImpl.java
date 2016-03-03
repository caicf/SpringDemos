package com.caicf.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.caicf.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void inMoney(String in, Double money) {
		String sql="update account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql, money,in);
	}

	@Override
	public void outMoney(String out, Double money) {
		String sql="update account set money=money-? where name=?";
		this.getJdbcTemplate().update(sql, money,out);
	}

}
