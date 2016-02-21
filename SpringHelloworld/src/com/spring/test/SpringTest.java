package com.spring.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;

public class SpringTest {

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
		
		
		Person person=(Person)context.getBean("chinese");
		person.speak();
		
		person=(Person)context.getBean("american");
		person.speak();

	}

}
