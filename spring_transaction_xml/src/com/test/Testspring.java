package com.test;

import javax.annotation.Resource;





import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.caicf.impl.AccountServiceImpl;
import com.caicf.service.AccountService;


//@ContextConfiguration("classpath:applicationContext.xml")
public class Testspring {
	
//	@Resource(name="accountService")
	private AccountService accountService;

//	public void setAccountService(AccountService accountService) {
//		this.accountService = accountService;
//	}

	@org.junit.Test
	public void test() {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println(applicationContext.getClass());
		accountService=(AccountService) applicationContext.getBean("accountService");
		accountService.transfer("aaa", "bbb", 200d);
		
		
	}

}
