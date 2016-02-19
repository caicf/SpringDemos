package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caicf.model.User;
import com.caicf.service.impl.UserServiceImpl;

public class UserServiceTest {

	private ApplicationContext context=null;
	
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("beans.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		UserServiceImpl serviceImpl=(UserServiceImpl)context.getBean("userService");
		User u=new User();
		u.setUsername("ccf");
		u.setPassword("123");
		serviceImpl.add(u);
	}

}
