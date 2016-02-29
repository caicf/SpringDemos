package com.caicf.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caicf.service.Persons;

public class ServiceTest {

	private ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Persons p=(Persons) context.getBean("person");
		System.out.println(p.getClass());
		p.say();
		p.run();
		
	}

}
