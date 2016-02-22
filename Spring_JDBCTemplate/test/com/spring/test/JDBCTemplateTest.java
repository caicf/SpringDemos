package com.spring.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class JDBCTemplateTest {

	private ApplicationContext context;
	private JdbcTemplate template;
	
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		template=(JdbcTemplate)context.getBean("jdbcTemplate");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//创建caicf表
		String sql="create table caicf(id int(11) , name varchar(20))";
		template.execute(sql);
	}

}
