package com.caicf.impl;

import com.caicf.dao.AccountDao;
import com.caicf.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao=null;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	@Override
	public void transfer(String out, String in, Double money) {
		accountDao.outMoney(out, money);
		
//		int i=1/0;
		
		accountDao.inMoney(in, money);
		System.out.println("success");
	}

}
