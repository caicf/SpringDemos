package com.spring.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTemplateTest {

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
		JdbcTemplate template=(JdbcTemplate)context.getBean("jdbcTemplate");
		String sql="create table caicf(id int(11) , name varchar(20))";
		template.execute(sql);
	}

}
